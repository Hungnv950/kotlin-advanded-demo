package com.gum.basic.test

fun whatString(string: String) {
    var upper: Int
    var low: Int
    var num: Int
    var special: Int
    var space: Int
    var nguyenAm: Int
    var phuAm: Int
    for (character in string) {
        when {
            character.isDigit() -> println("number")
        }
    }
}

fun main(args: Array<String>) {
    whatString("1")
}
