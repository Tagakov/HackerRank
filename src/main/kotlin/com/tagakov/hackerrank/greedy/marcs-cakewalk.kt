package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    val cakes = Scanner(System.`in`).run { (1..nextInt()).map { nextInt() }.sortedDescending() }
    val res = cakes
            .foldIndexed(0.toLong()) { index, acc, cals ->
                acc + cals * Math.pow(2.toDouble(), index.toDouble()).toLong()
            }
    print(res)
}