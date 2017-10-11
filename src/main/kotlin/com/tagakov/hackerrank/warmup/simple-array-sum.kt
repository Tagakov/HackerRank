package com.tagakov.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    fun read() = Scanner(System.`in`).run {
        (1..nextInt()).map { nextInt() }
    }

    println(read().sum())
}