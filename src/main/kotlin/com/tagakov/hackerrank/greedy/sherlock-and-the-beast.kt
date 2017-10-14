package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).run { (1..nextInt()).map { nextInt() } }
            .forEach {
                var numOfFives = it
                var numOfThrees = 0
                while (numOfFives % 3 != 0 && numOfFives - 5 >= 0) {
                    numOfFives -= 5
                    numOfThrees += 5
                }
                if (numOfThrees % 5 == 0 && numOfFives % 3 == 0) {
                    println("5".repeat(numOfFives) + "3".repeat(numOfThrees))
                } else {
                    println(-1)
                }
            }
}