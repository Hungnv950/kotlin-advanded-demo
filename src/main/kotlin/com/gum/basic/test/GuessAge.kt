package com.gum.basic.test

import java.util.Random

/*
Viết chương trình chơi game đoán số, mô tả game như sau:
Khởi tạo ban đầu người chơi có 5 điểm
Máy tự động Random ngẫu nhiên 1 số từ 0->5 (số này sẽ không xuất ra, chỉ dùng để so sánh với số số mà người chơi đoán
Người chơi đoán số, Nếu đoán đúng thì + 1 điểm vào điểm khởi tạo, ngược lại -1 điểm (Chú ý là có xuất thông báo khi người chơi đoán trúng hay đoán sai)
Khi người chơi không còn điểm nào thì thông báo Game Over
Nếu người chơi tích lũy được 10 điểm thì thông báo Congratulations! You Win!*/

fun readInts(separator: Char = ' ') = readLine()!!.split(separator).map(String::toInt)

fun guessAge(): Boolean {
    var point = 5
    while (point != 0) {
        val input = readInts()
        val input_ = input[0]
        val ranInt = Random().nextInt(5 - 0) + 0
        if (input_ <= 5 || input_ >= 0) {
            if (input_ == ranInt) {
                println("True")
                point++
            } else {
                println("False")
                point--
            }
        }
    }
    print("Game Over")
    return true
}

fun main(args: Array<String>) {
    guessAge()
}
