package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    val list = Scanner(System.`in`).run {
        (1..nextInt()).map { nextInt() }.sorted()
    }

    var min = Integer.MAX_VALUE
    for (i in 0..list.size - 2) {
        min = Integer.min(min, Math.abs(list[i] - list[i + 1]))
    }

    print(min)
}