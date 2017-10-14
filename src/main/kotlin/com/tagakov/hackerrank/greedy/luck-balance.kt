package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    class Contest(val luck: Int, val important: Int)

    Scanner(System.`in`).apply {
        val n = nextInt()
        var lifes = nextInt()

        val totalLuck = (1..n)
                .map { Contest(nextInt(), nextInt()) }
                .sortedWith(compareBy({ it.important }, { -it.luck }))
                .asSequence()
                .onEach { lifes -= it.important }
                .fold(0) { acc, it ->
                    acc + it.luck * if (lifes >= 0) 1 else -1
                }
        print(totalLuck)
    }
}