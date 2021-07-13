import java.lang.Integer.min
import java.util.*
import kotlin.math.absoluteValue
import kotlin.math.max
import java.util.Collections.min as min1

fun main() {
    val number1 = intArrayOf(1, 9, 9, 9, 9)
    val number2 = intArrayOf(1, 9, 6, 7, 9)

    println(sum(number1, number2).contentToString())
}

fun sum(number1: IntArray, number2: IntArray): IntArray {
    number1.reverse()
    number2.reverse()
    var temp = min(number1.lastIndex, number2.lastIndex)
    val sizeResultArray = max(number1.size, number2.size)
    var numResult = IntArray(sizeResultArray + 1) { 0 }

    for (i in 0..temp) {
        numResult[i] = number1[i] + number2[i] + numResult[i]

        if (numResult[i] > 9) {
            numResult[i] = numResult[i].rem(10)
            numResult[i + 1]++
        }
    }

    for (k in (temp + 1) until numResult.lastIndex) {
        if (number1.size > number2.size) {
            numResult[k] = numResult[k] + number1[k]
        } else if (number1.size < number2.size) {
            numResult[k] = numResult[k] + number2[k]
        }

        if (numResult[k] > 9) {
            numResult[k] = numResult[k].rem(10)
            numResult[k + 1]++
        }
    }

    if (numResult[numResult.lastIndex] == 0) {
        numResult = numResult.copyOfRange(0, numResult.lastIndex)
    }

    numResult.reverse()
    return numResult
}