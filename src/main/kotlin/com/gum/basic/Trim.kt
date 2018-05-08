package com.gum.basic

import jdk.nashorn.internal.objects.NativeString.substring

fun main(args: Array<String>) {
    val s: String = "    how the shit day ?    "
    val s2 = s.trimStart()
    println(s2)
    val s3 = s.trimEnd()
    println(s3)
    val s4 = s.trim()
    println(s4)
    println(s4.substring(4, 7))

    val ms = "D:/music/bolero/longme.mp3"
    val ms1 = first(ms)
    println(ms1)
    val ms2 = second(ms)
    println(ms2)
    val ms3 = third(ms)
    println(ms3)
}

fun first(str: String): String {
    val arr = str.split("/")
    return arr[arr.size - 1]
}

fun second(str: String): String {
    val str1 = str.lastIndexOf("/")
    return str.substring(str1 + 1)
}

fun third(str: String): String {
    val s1 = str.lastIndexOf("/")
    val s2 = str.lastIndexOf(".")
    return str.substring(s1 + 1, s2)
}
