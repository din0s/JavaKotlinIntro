package me.din0s

class Person(val name: String, var age: Int = 0) {
    fun introduce() {
        print("My name is $name.")
        print("I'm $age years old.")
    }

    fun growUp() {
        age++
    }
}

fun main() {
    val me = Person("dinos", 20)
    me.introduce()
    println("Hey ${me.name}, you need to grow up.")
    me.growUp()
}
