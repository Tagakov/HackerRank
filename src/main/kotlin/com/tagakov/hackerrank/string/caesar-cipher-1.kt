package com.tagakov.hackerrank.string

import java.util.*

fun main(args: Array<String>) {
    val (string, shift) = Scanner(System.`in`).run { next(); next() to nextInt(); }
    string.map { it.shiftBy(shift) }.joinToString(separator = "").also { print(it) }
}

private fun Char.shiftBy(shift: Int): Char {
    if (!isLetter()) return this
    val charsCount = 26
    val baseLetter = if (isUpperCase()) 'A' else 'a'
    return baseLetter + (this - baseLetter + shift).rem(charsCount)
}
