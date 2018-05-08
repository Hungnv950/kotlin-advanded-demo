package com.gum.basic

fun main(args: Array<String>) {
    val s = "Xin chào Obama! Tui là Putin, Xin chào"
    val s3 = s.substring(9, 14)
    println(s3)
    val s1 = s.replace("Xin chào", "Hello")
    println(s1)
    val s2 = s.replaceFirst("Xin chào", "Hello")
    println(s2)
}
