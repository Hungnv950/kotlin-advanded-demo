package com.gum.basic.test

fun convertString(str: String): String {
    val string = str.trim()
    var string_ = string.split(" ")
    var result = ""
    for (word in string_) {
        if (word.toString().length > 0) {
            var wordTmp = word.toLowerCase().toString()
            wordTmp = wordTmp.toString().replaceFirst(wordTmp[0]+"", (wordTmp[0]+"").toUpperCase())
            result += wordTmp + " "
        }
    }

    return result.trim()
}

fun main(args: Array<String>) {
    var str = "AcsA acsA cas   Acsd  "
    print(convertString(str))
}
