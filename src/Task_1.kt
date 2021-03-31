fun main() {
    println(ktMethod(327))
    println(method(327))
}

fun ktMethod(number: Int): Int {
    val arrayOfDigits = number.toString().map { Character.getNumericValue(it) }
    val sumOfDigits = arrayOfDigits.sum()
    val multiplySumOfDigits = arrayOfDigits.reduce { acc, i ->
        acc * i
    }
    return multiplySumOfDigits - sumOfDigits
}

fun method(number: Int): Int {
    var mNumber = number
    var multiplySum = 1
    var jami = 0

    for (i in number.toString().indices) {
        val digit = mNumber % 10
        multiplySum *= digit
        jami += digit
        mNumber /= 10
    }
    return multiplySum - jami
}