package com.rafaph

fun main() {
    val user = User("Raphael")
    println("Hello ${user.name}!")
}

class User(val name: String)