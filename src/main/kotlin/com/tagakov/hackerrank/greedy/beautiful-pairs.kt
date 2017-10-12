//https://www.hackerrank.com/challenges/beautiful-pairs/problem
package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).apply {
        val n = nextInt()
        val counters = hashMapOf<Int, Int?>()

        for (i in 1..n) {
            val number = nextInt()
            val counter = counters[number] ?: 0
            counters[number] = counter + 1
        }

        var pairsCount = 0

        for (i in 1..n) {
            val number = nextInt()
            val counter = counters[number] ?: 0
            counters[number] = counter - 1
            if (counter > 0) {
                pairsCount++
            }
        }

        println(if (pairsCount == n) pairsCount - 1 else pairsCount + 1)
    }
}

//I could not find where I am supposed to use greedy