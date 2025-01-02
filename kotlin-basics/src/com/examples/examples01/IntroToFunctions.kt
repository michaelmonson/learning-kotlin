package com.examples.examples01

// Function with block body
fun calculateSum(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun calculateProduct(numbers: List<Int>): Int = numbers.reduce { acc, number -> acc * number }

fun calculateQuotient(numbers: List<Int>): Int {
    var quotient = numbers[0] //start with the first number
    for (i in 1 until numbers.size) {
        quotient /= numbers[1]
    }
    return quotient
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = calculateSum(numbers)
    val product = calculateProduct(numbers)
    val quotient = calculateQuotient(numbers)

    //Print Values:
    println("Sum: $sum")
    println("Product: $product")
    println("Quotient: $quotient")
}

