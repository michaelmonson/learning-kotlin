package com.examples.examples01

import java.util.logging.Logger

private val logger = Logger.getLogger("Main")

fun main() {
    // Nullable vs Non-nullable types
    val nonNullString: String = "Can't be null"
    val nullableString: String? = null

    // Safe call operator
    logger.info(nonNullString.length.toString())
    logger.info(nullableString?.length.toString())  // Safe way to access nullable

    // Elvis operator
    val length = nullableString?.length ?: 0  // If null, use 0
    logger.info(length.toString())

    // Better pattern for null checks
    nullableString?.let {
        logger.info("String length is: ${it.length}")
    } ?: logger.info("String was null")

    // Not-null assertion (use carefully!)
    val mustNotBeNull: String = nullableString!!  // Will throw NPE if null

    // Try it yourself:
    // 1. Create a nullable variable
    // 2. Use safe call to log its length
    // 3. Use Elvis operator to provide a default value
}