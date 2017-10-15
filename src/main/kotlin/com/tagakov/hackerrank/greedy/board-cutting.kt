package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    fun Scanner.solve() {
        val y = nextInt() - 1
        val x = nextInt() - 1

        var horizontalCuts = 0
        var verticalCuts = 0

        ((1..y).map { true to nextLong() }.asSequence() + (1..x).map { false to nextLong() }.asSequence())
                .sortedByDescending { it.second }
                .map { (isHorizontalCut, cost) ->
                    if (isHorizontalCut) {
                        horizontalCuts++
                        cost * (verticalCuts + 1)
                    } else {
                        verticalCuts++
                        cost * (horizontalCuts + 1)
                    }
                }
                .sum()
                .also { println(it % 1000000007L) }
    }

    Scanner(System.`in`).apply { (1..nextInt()).forEach { solve() } }
}