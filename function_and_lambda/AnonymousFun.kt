fun main(){
    println("=== Anonymous Function Example ===\n")

    val multiply = fun(a: Int, b: Int): Int 
{
    return a * b
}
val result = multiply(4, 5)

println("Result of multiplication is: $result")
}