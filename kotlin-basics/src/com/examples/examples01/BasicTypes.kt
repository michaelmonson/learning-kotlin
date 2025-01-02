package com.examples.examples01

/* Every variable and data structure in Kotlin has a type.  Types are important because
 * they tell the compiler what you are allowed to do with that variable or data structure.
 * In other words, what functions and properties it has.
 *
 * Kotlin's ability to infer the type is called type inference. 'customers' is assigned an
 * integer value. From this, Kotlin infers that customers has a numerical type Int. As a result,
 * the compiler knows that you can perform arithmetic operations with customers:
 */
class BasicTypes {

    var customers = 10

    // Some customers have left the queue:
    customers = 8

    customers = customers + 3 // Example of addition: 11
    customers += 7            // Example of addition: 18
    customers -= 3            // Example of subtraction: 15
    customers *= 2            // Example of multiplication: 30
    customers /= 3            // Example of division: 10

    println(customers) // 10

}