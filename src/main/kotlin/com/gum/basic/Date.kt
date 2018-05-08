package com.gum.basic

import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    val cal = Calendar.getInstance()
    val year = cal.get(Calendar.YEAR)
    println(year)
    var date= cal.time
    var sdf= SimpleDateFormat("dd/MM/yyyy");
    println(sdf.format(date))
    var sdf2=SimpleDateFormat("dd/MM/yyyy E");
    println(sdf2.format(date))
}
