package com.gum.basic

fun panlyndrome(str: String): String {
    for (i in str.indices) {
        if (str[i] != str[str.length - i - 1]) {
            return "KO"
        }
    }
    return "OK"
}

fun main(args: Array<String>) {
    println(panlyndrome("abcde"))
    println(panlyndrome("abcwcba"))
}
