package com.tagakov.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val n = Scanner(System.`in`).readN()
    for (i in 1..n) {
        println(" ".repeat(n - i) + "#".repeat(i))
    }
}

private fun Scanner.readN() = nextInt()