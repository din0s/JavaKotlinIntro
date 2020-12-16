package me.din0s

fun main() {
    val a: Int = 1  // immediate assignment
    val b = 2       // type is inferred
    val c: Int      // type required when no init
    c = 3           // deferred assignment

    var x = 0       // type is inferred
    x += 5          // 'var' means mutable
}
