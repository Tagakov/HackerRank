package com.tagakov.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val (a, b) = Scanner(System.`in`).run { readScore().zip(readScore()) }
            .fold(0 to 0) { (ga, gb), (la, lb) ->
                (ga + if (la > lb) 1 else 0) to (gb + if (la < lb) 1 else 0)
            }

    println("$a $b")
}


private fun Scanner.readScore() = (1..3).map { nextInt() }