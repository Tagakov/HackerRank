package com.tagakov.hackerrank.warmup

import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {
    fun Scanner.readList() = (1..5)
            .map { nextBigDecimal() }
            .sorted()

    val list = Scanner(System.`in`).readList()
    val min = list.dropLast(1).reduce(BigDecimal::add)
    val max = list.drop(1).reduce(BigDecimal::add)
    println("$min $max")
}