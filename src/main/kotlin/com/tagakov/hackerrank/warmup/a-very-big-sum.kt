package com.tagakov.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val matrix = Scanner(System.`in`).readMatrix()
    println((matrix.primaryDiagonal.sum() - matrix.secondaryDiagonal.sum()).abs())
}

private fun Scanner.readMatrix(): Matrix {
    val size = nextInt()
    val matrix = (1..size * size).map { nextInt() }
    return Matrix(size, matrix)
}

private class Matrix(val size: Int, matrix: List<Int>) {
    val primaryDiagonal by lazy { (0 until size * size step size + 1).map { matrix[it] } }
    val secondaryDiagonal by lazy { (size * size - size downTo 1 step size - 1).map { matrix[it] } }
}

private fun Int.abs() = Math.abs(this)