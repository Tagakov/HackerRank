package com.tagakov.hackerrank.string

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).run { (1..nextInt()).map { next() } }
            .map { containsString(it, "hackerrank") }
            .forEach {
                println(if (it) "YES" else "NO")
            }
}

fun containsString(source: String, dest: String): Boolean {
    val sourceIterator = source.iterator()
    val destIterator = dest.iterator()

    var currentDest = destIterator.next()

    while (sourceIterator.hasNext()) {
        val currSource = sourceIterator.next()
        if (currSource == currentDest) {
            if (destIterator.hasNext()) {
                currentDest = destIterator.next()
            } else {
                return true
            }
        }
    }
    return false
}