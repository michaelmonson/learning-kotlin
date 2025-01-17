package com.examples.examples01

import java.util.*
import java.util.logging.Logger

private val logger = Logger.getLogger("Main")

/*
 * NOTE:  Kotlin recommends that you declare all variables as read-only (val)
 *        by default. Declare mutable variables (var) only if necessary.
 */
fun main() {
    //val vs. var
    val immutableString = "This is an immutable string and cannot be changed!" //like 'final' in Java
    var mutableString   = "This String value CAN be changed..."

    //Output to show the variable values:
    logger.info(immutableString)
    logger.info(mutableString)

    mutableString = "See? Changed!"
    logger.info(mutableString)

    //String templates:
    val name = "Developer Joe"
    println("Hello, $name! How are you?") // Simple variable reference
    println("Hello, ${name.uppercase(Locale.getDefault())}! How are you?") // Complex variable reference
    println("2 + 2 = ${2 + 2}") // Expression in template

    // Try it yourself:
    // 1. Create a variable with your name
    // 2. Log a message using string template with your name
    // 3. Try to modify a val and see what happens

    val happyName = "Mary"
    val age = 20
    println("$happyName is $age years old")
}