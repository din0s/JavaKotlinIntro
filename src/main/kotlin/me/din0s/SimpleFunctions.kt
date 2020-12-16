package me.din0s

fun sum(a: Int, b: Int) = a + b

fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun random(seed: Int = 0): Int {
    return 42 * seed
}

fun String.isExcited() = this.endsWith("!")
