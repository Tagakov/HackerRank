package com.tagakov.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val candles = Scanner(System.`in`).run { (1..nextInt()).map { nextInt() } }
    val tallest = candles.max()
    println(candles.count { it == tallest })
}