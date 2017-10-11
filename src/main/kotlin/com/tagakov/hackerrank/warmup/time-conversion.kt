package com.tagakov.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val time = Scanner(System.`in`).nextLine()
    val isAm = time[time.length - 2] == 'A'
    val endOfHoursIndex = time.indexOf(':')
    val hours = time.substring(0, endOfHoursIndex).toInt()
    val correctedHours = String.format("%02d",
            if (isAm && hours == 12) 0
            else if (!isAm && hours != 12) hours + 12
            else hours
    )

    print("$correctedHours${time.substring(endOfHoursIndex, time.length - 2)}")
}