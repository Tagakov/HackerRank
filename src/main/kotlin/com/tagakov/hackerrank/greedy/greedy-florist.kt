package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).apply {
        val n = nextInt()
        val k = nextInt()
        (1..n)
                .map { nextInt() }
                .sortedDescending()
                .foldIndexed(0) { i, totalCost, cost ->
                    totalCost + cost * (i / k + 1)
                }
                .also { print(it) }
    }
}