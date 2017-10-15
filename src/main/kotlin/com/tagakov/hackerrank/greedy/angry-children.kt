package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).apply {
        val n = nextInt()
        val k = nextInt() - 1
        val list = (1..n).map { nextInt() }.sorted()

        val min = list.dropLast(k).zip(list.drop(k))
                .map { (first, second) -> second - first }
                .min()

        print(min)

    }
}