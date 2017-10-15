package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).apply {
        val n = nextInt()
        var money = nextInt()
        val count = (1..n)
                .map { nextInt() }
                .sorted()
                .asSequence()
                .takeWhile { money - it >= 0 }
                .onEach { money -= it }
                .count()
        print(count)
    }
}