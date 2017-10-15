package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).apply {
        val n = nextInt()

        class Order(val number: Int, val endTime: Int)

        (1..n)
                .map { index -> Order(index, nextInt() + nextInt()) }
                .sortedWith(compareBy(Order::endTime).then(compareBy(Order::number)))
                .joinToString(separator = " ", transform = { it.number.toString() })
                .also { print(it) }
    }
}