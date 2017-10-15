package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).apply {
        val n = nextInt()
        var k = nextInt()
        val list = (1..n).map { nextInt() }.toMutableList()
        val valueMap = mutableMapOf<Int, Int>().also {
            list.forEachIndexed { index, i -> it[i] = index }
        }

        var i = 0
        while (k > 0 && i < n) {
            val current = list[i]
            val maxPossibleElement = n - i
            if (list[i] != maxPossibleElement) {
                val maxPossibleElementIndex = valueMap[maxPossibleElement]!!

                list[i] = maxPossibleElement
                list[maxPossibleElementIndex] = current

                valueMap[current] = maxPossibleElementIndex
                valueMap[maxPossibleElement] = i

                k--
            }
            i++
        }

        println(list.joinToString(separator = " "))
    }
}