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

    /*
     * Why was 'customers' being flagged by IntelliJ as never being used?  What is possibly wrong with this?
     *
     * Answer: Issue here was that I was trying to execute code directly in the body of a Kotlin class.
     *         In Kotlin, you can't write top-level statements like this in a class body unless they're wrapped in
     *         a function, initializer block, or other valid construct.
     * Resolution:  Wrap the code in a function, initializer block, or other valid construct.
     *   - init block: This is an initializer block that runs when an instance of the class is created.
     *                 All your statements modifying customers need to go here.
     *   - function: You can create a function and call it from the init block.
     *   - other valid construct: You can use other valid constructs like a constructor or a companion object.
     *
     *   In this case, I've wrapped the code in an init block. The customers property is now being used and modified
     *   inside the init block, so there won't be any complaints about it being unused.
     */
    var customers = 10

    init {
        println(customers) // 10

        // Some customers have left the queue:
        customers = 8

        customers = customers + 3 // Example of addition: 11
        customers += 7            // Example of addition: 18
        customers -= 3            // Example of subtraction: 15
        customers *= 2            // Example of multiplication: 30
        customers /= 3            // Example of division: 10

        println(customers) // 10
    }

    fun main() {
        BasicTypes()
    }

}