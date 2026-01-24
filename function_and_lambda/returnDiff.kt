fun main() {
    println("=== Return in Function vs Lambda ===\n")


    fun doubleNumber(num: Int): Int {
        if (num == 0) {
            return 0   //  the function
        }
        return num * 2
    }

    println("Function result: ${doubleNumber(5)}")
    println("Function result: ${doubleNumber(0)}\n")


    val lambdaDouble = label@{ x: Int ->
        if (x == 0) {
            return@label 0  
        }
        x * 2
    }

    println("Lambda result: ${lambdaDouble(5)}")
    println("Lambda result: ${lambdaDouble(0)}")
}
