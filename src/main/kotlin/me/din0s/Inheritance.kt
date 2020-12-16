package me.din0s

import kotlin.math.PI
import kotlin.math.pow

abstract class Shape2D {
    abstract fun getArea(): Double
    abstract fun getCircumference(): Double
}

class Rectangle(val base: Double, val height: Double): Shape2D() {
    override fun getArea() = base * height
    override fun getCircumference() = 2 * (base + height)
}

class Circle(val radius: Double) : Shape2D() {
    override fun getArea() = PI * radius.pow(2)
    override fun getCircumference() = 2 * PI * radius
}
