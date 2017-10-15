package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    val weights = Scanner(System.`in`).run { (1..nextInt()).map { nextInt() }.sorted() }
    weights
            .fold(0 to -1) { acc, w ->
                if (w > acc.second) {
                    acc.first + 1 to w + 4
                } else {
                    acc
                }
            }
            .also { println(it.first) }
}