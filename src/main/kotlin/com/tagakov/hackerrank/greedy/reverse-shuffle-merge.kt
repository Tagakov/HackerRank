package com.tagakov.hackerrank.greedy

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    fun HashMap<Char, Int>.increment(c: Char) = ((get(c) ?: 0) + 1).also { put(c, it) }
    fun HashMap<Char, Int>.decrement(c: Char) = ((get(c) ?: 0) - 1).also { put(c, it) }

    Scanner(System.`in`).apply {
        val line = nextLine()

        val charArray = line.toCharArray().reversedArray()
        val resultStringSize = charArray.size / 2
        val totals = hashMapOf<Char, Int>()

        for (c in charArray) {
            totals.increment(c)
        }

        val counts = HashMap(totals).apply { replaceAll { _, counter -> counter / 2 } }

        val sorted = totals.keys.sorted().toMutableList()
        val result = ArrayList<Char>(resultStringSize)

        var i = 0
        var smallestIndex = -1

        while (i < charArray.size) {
            val c = charArray[i++]
            if (counts[c] == 0) continue
            if (sorted[0] == c) {
                result.add(c)
                if (counts.decrement(c) == 0) {
                    sorted.removeAt(0)
                }
                smallestIndex = -1
            } else if (counts[c] == totals[c]) {
                if (smallestIndex != -1 && c >= charArray[smallestIndex]) {
                    val smallest = charArray[smallestIndex]
                    result.add(smallest)
                    if (counts.decrement(smallest) == 0) {
                        sorted.remove(smallest)
                    }
                    while (i > smallestIndex + 1) {
                        totals.increment(charArray[--i])
                    }

                } else {
                    result.add(c)
                    if (counts.decrement(c) == 0) {
                        sorted.remove(c)
                    }
                }
                smallestIndex = -1
            } else {
                val newSmallestIndex = i - 1
                if (smallestIndex == -1) {
                    smallestIndex = newSmallestIndex
                } else {
                    val smallestC = charArray[smallestIndex]
                    if (smallestC > c) {
                        smallestIndex = newSmallestIndex
                    }
                }
            }
            totals.decrement(c)
        }

        println(result.joinToString(separator = ""))
    }

}