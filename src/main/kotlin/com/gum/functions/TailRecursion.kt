package com.gum.functions

fun factorial(number: Int): Int {
    when (number) {
        0,1 -> return 1
        else -> return number * factorial(number -1)
    }
}

fun factorialTR(number: Int, accumulator: Int = 1 ): Int {
    when (number) {
        0,1 -> return accumulator
        else -> return factorialTR(number -1, accumulator * number)
    }
}

fun main(args: Array<String>) {
    println(factorial(6))
    println(factorialTR(6))
}
