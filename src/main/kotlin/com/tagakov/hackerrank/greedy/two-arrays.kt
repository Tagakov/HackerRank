package com.tagakov.hackerrank.greedy

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).apply {
        val q = nextInt()
        (1..q).map {
            val n = nextInt()
            val k = nextInt()
            val ascending = (1..n).map { nextInt() }.sorted().asSequence()
            val descending = (1..n).map { nextInt() }.sortedDescending().asSequence()
            ascending.zip(descending)
                    .map { (one, another) -> one + another }
                    .all { it >= k }
        }
                .joinToString(separator = "\n", transform = { if (it) "YES" else "NO" })
                .also { print(it) }
    }
}