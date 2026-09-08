package com.example.baitapvonglap

fun main() {

    // Nhap thong tin sinh vien
    print("Nhap ho ten sinh vien: ")
    val hoTen = readLine()!!

    print("Nhap ma sinh vien: ")
    val maSV = readLine()!!

    // Nhap diem 3 mon
    print("Nhap diem Math: ")
    val math = readLine()!!.toDouble()

    print("Nhap diem Programming: ")
    val programming = readLine()!!.toDouble()

    print("Nhap diem Database: ")
    val database = readLine()!!.toDouble()

    // Tinh tong diem
    val tongDiem = math + programming + database

    // Tinh diem trung binh
    val diemTrungBinh = tongDiem / 3.0

    // Tim diem cao nhat
    val diemCaoNhat = maxOf(math, programming, database)

    // Kiem tra sinh vien dat hay khong
    val ketQua = if (diemTrungBinh >= 5.0) {
        "DAT"
    } else {
        "KHONG DAT"
    }

    // In ket qua
    println("\n========== THONG TIN SINH VIEN ==========")
    println("Ho ten: $hoTen")
    println("Ma sinh vien: $maSV")

    println("\n========== DIEM CAC MON ==========")
    println("Math: $math")
    println("Programming: $programming")
    println("Database: $database")

    println("\n========== KET QUA ==========")
    println("Tong diem: $tongDiem")
    println("Diem trung binh: %.2f".format(diemTrungBinh))
    println("Diem cao nhat: $diemCaoNhat")
    println("Ket qua: $ketQua")
}