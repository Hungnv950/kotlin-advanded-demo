package com.gum.advanced.functions

inline fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunction() {
    val numbers = 1..100
    numbers.myForEach ( fun(element) {
        if (element % 5 == 0) {
            return
        }
    })
    println("Hello")
}

fun main(args: Array<String>) {
    containingFunction()
}
