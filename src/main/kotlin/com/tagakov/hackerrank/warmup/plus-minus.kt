package com.tagakov.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    fun Scanner.readData() = (1..nextInt()).map { nextInt() }

    val data = Scanner(System.`in`).readData()
    var positive = 0
    var negative = 0
    for (i in data) {
        if (i > 0) {
            positive++
        } else if (i < 0) {
            negative++
        }
    }
    println(positive.toFloat() / data.size)
    println(negative.toFloat() / data.size)
    println((data.size - positive - negative).toFloat() / data.size)
}