package com.gum.advanced.functions

 data class Time(val h: Int, val m: Int) {
    operator fun plus(time: Time): Time {
        var m = this.m + time.m
        val hInMinutes = m /60
        m = m % 60
        val h = this.h + time.h + hInMinutes
        return Time(h, m)
    }
}

operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach { this.append(it) }
}

fun main(args: Array<String>) {
    val newTime = Time(19, 10).plus(Time(10, 10))
    print(newTime)
    val sb = StringBuilder()
    for (str in sb) {
        str + "value"
    }
    println(sb)
}
