package com.tagakov.hackerrank.greedy

import java.util.*
import kotlin.collections.HashMap

private class LineRegistry(line: String) {
    private fun HashMap<Char, Int>.increment(c: Char) = ((get(c) ?: 0) + 1).also { put(c, it) }
    private fun HashMap<Char, Int>.decrement(c: Char) = ((get(c) ?: 0) - 1).also { put(c, it) }

    private val reversedLine = line.reversed()
    private val charsCounter = line.fold(hashMapOf<Char, Int>()) { acc, c -> acc.apply { increment(c) } }
    private val sortedChars = line.toSortedSet()
    private val remainingInResult = HashMap(charsCounter).apply { replaceAll { _, counter -> counter / 2 } }
    private val result = StringBuilder()

    private var index = 0

    fun result() = result.toString()

    fun hasNext() = index < reversedLine.length

    fun next() = CharEntry(index++).also { charsCounter.decrement(it.char) }

    fun appendToResult(entry: CharEntry) {
        if (remainingInResult.decrement(entry.char) == 0) {
            sortedChars.remove(entry.char)
        }
        result.append(entry.char)
    }

    fun rewindToEntry(entry: CharEntry) {
        for (i in entry.index + 1 until index) {
            charsCounter.increment(reversedLine[i])
        }
        index = entry.index + 1
    }

    inner class CharEntry(val index: Int) : Comparable<CharEntry> {
        val char: Char = reversedLine[index]
        val isMinimal = !sortedChars.isEmpty() && sortedChars.first() == char
        val isCritical = remainingInResult[char] == charsCounter[char]
        val isNeeded = remainingInResult[char] != 0

        override fun compareTo(other: CharEntry) = char.compareTo(other.char)
    }
}

fun main(args: Array<String>) {
    val lineRegistry = LineRegistry(Scanner(System.`in`).nextLine())

    var minimalSkippedEntry: LineRegistry.CharEntry? = null

    while (lineRegistry.hasNext()) {
        val letter = lineRegistry.next()
        if (!letter.isNeeded) continue

        when {
            letter.isMinimal -> {
                lineRegistry.appendToResult(letter)
                minimalSkippedEntry = null
            }

            letter.isCritical && minimalSkippedEntry != null && minimalSkippedEntry <= letter -> {
                lineRegistry.rewindToEntry(minimalSkippedEntry)
                lineRegistry.appendToResult(minimalSkippedEntry)
                minimalSkippedEntry = null
            }

            letter.isCritical -> {
                lineRegistry.appendToResult(letter)
                minimalSkippedEntry = null
            }

            minimalSkippedEntry == null || minimalSkippedEntry > letter -> minimalSkippedEntry = letter
        }
    }
    println(lineRegistry.result())
}