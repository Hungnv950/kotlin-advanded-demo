package com.gum.advanced.functions

inline  fun op(x: Int) {
    println("op")
}

inline fun operation(noinline op: () -> Unit) {
    val x = op
    println("before op")
    op()
    println("after op")
}

fun main(args: Array<String>) {
    operation { println("Operation main")}
    println("hello world")
}
