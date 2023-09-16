package com.example.w01_homework

object Driver {

    @JvmStatic
    fun main(args: Array<String>) {
        val square: Shape = Square(4.0)
        val rectangle: Shape = Rectangle(4.0, 5.0)
        val triangle: Shape = Triangle(9.0, 2.0)

        println(square)
        println(rectangle)
        println(triangle)
    }
}