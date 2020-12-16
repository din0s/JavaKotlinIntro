package me.din0s

fun parseInt(str: String): Int? {
    return when (str) {
        "zero" -> 0
        "one" -> 1
        "two" -> 2
        // ...
        else -> null
    }
}

fun main() {
    val i = parseInt("two")
    val j = i!!     // we guarantee that i isn't null
    val k = i ?: -1 // if i is null, provide a fallback
}
