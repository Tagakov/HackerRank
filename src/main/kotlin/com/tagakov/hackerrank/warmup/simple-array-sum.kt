package com.tagakov.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    println(read().sum())
}

fun read() = Scanner("2\n2 3").run {
    (1..nextInt()).map { nextInt() }
}