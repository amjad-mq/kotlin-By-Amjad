fun main(){
    print("Enter a number: ")

    var num = readLine()!!.toInt()

    var fact = 1
    
    for(x in 1.. num){
        fact = fact * x
    }

    println("Factorial of $num is $fact")
}