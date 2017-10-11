package com.tagakov.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    fun Scanner.readScore() = (1..nextInt()).map { nextBigDecimal() }

    println(Scanner(System.`in`).readScore().reduce { acc, next -> acc + next })
}