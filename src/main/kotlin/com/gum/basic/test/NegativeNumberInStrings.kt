package com.gum.basic.test

fun negaTiveNumberInSring(str: String) {
    val str_ = str.split("-")
    for (word in str_) {
        var result = ""
        for (characer in word) {
            if (characer.isDigit()) {
                result += characer
            }
            if (characer.isLetter()) {
                break
            }
        }
        println(result)
    }
}

fun main(args: Array<String>) {
    negaTiveNumberInSring("abc-5x6yz-12k9l--p")
}
