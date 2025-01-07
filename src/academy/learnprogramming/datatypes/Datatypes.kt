//package academy.learnprogramming.datatypes
//
//import academy.learnprogramming.javacode.DummyClass
//import java.math.BigDecimal
//import javax.swing.text.html.HTML.Tag.I
//import kotlin.coroutines.experimental.EmptyCoroutineContext.plus
//
//fun main(args: Array<String>) {
//
//    val names = arrayOf("John", "Jane", "Jill", "Joe")
//
//    val longs1 = arrayOf(1L, 2L, 3L)
//    val longs2 = arrayOf<Long>(1, 2, 3, 4)
//
//    val longs3 = arrayOf(1, 2, 3, 4)
//
//    println(longs1 is Array<Long>)
//    println(longs2 is Array<Long>)
//    println(longs3 is Array<Int>)
//
//    //println(longs1[2])
//
//    val evenNumbers = Array(16) { i -> i * 2 }
//
////    for (number in evenNumbers) {
////        println(number)
////    }
//
//    val lotsOfNumbers = Array(100000) { i -> i + 1 }
//
//    val allZeroes = Array(100) { 0 }
//
//    var someArray: Array<Int>
//    someArray = arrayOf(1, 2, 3, 4)
//    for (number in someArray) {
//        println(number)
//    }
//    someArray = Array(6) { i -> (i + 1) * 10 }
//    for (number in someArray) {
//        println(number)
//    }
//
//    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
//    for (element in mixedArray) {
//        println(element)
//    }
//
//    println(mixedArray is Array<Any>)
//
//    val myIntArray = intArrayOf(3, 9, 434, 2, 33)
//    DummyClass().printNumbers(myIntArray)
//
//    var someOtherArray = IntArray(5)
//    for (number in someOtherArray) {
//        println(number)
//    }
//
//    DummyClass().printNumbers(evenNumbers.toIntArray())
//
//    val convertedIntArray = myIntArray.toTypedArray()
//
//
//
//}
//
//

// Onde está o erro de experimental
//@experimental // Errado
//// Deve ser algo como:
//@OptIn(ExperimentalXXX::class) // Correto
//
//// Onde está o erro de Array
//if (something is Array<Any>) // Errado
//// Deve ser algo como:
//if (something.isArray()) // Correto
//// ou
//if (something is Array<*>) // Correto

package academy.learnprogramming.datatypes

import academy.learnprogramming.javacode.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)
    val longs3 = arrayOf(1, 2, 3, 4)

    // Corrigindo as verificações de tipo
    println(longs1 is Array<*>) // use Array<*> em vez de Array<Long>
    println(longs2 is Array<*>)
    println(longs3 is Array<*>)

    val evenNumbers = Array(16) { i -> i * 2 }

    val lotsOfNumbers = Array(100000) { i -> i + 1 }

    val allZeroes = Array(100) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for (number in someArray) {
        println(number)
    }

    someArray = Array(6) { i -> (i + 1) * 10 }
    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)
    }

    // Corrigindo a verificação de tipo
    println(mixedArray is Array<*>)

    val myIntArray = intArrayOf(3, 9, 434, 2, 33)
    DummyClass().printNumbers(myIntArray)

    var someOtherArray = IntArray(5)
    for (number in someOtherArray) {
        println(number)
    }

    DummyClass().printNumbers(evenNumbers.toIntArray())

    val convertedIntArray = myIntArray.toTypedArray()
}