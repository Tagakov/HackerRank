package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).apply {
        val sticks = (1..nextInt())
                .map { nextInt() }
                .filter { it > 0 }
                .sortedDescending()

        for (i in 0 until sticks.size - 2) {
            val hypotenuse = sticks[i]
            val cathetus1 = sticks[i + 1]
            val cathetus2 = sticks[i + 2]

            if (cathetus1 + cathetus2 > hypotenuse) {
                print("$cathetus2 $cathetus1 $hypotenuse")
                return
            }
        }
        print(-1)
    }
}