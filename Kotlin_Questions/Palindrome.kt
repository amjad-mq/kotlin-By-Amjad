fun main(){
    print("Enter a number: ")
    var num = readLine()!!.toInt()
    var origionalNum = num
    var reversed = 0

    while(origionalNum != 0){
        val digit = origionalNum % 10
        reversed = reversed * 10 + digit
        origionalNum /= 10
    }

    if(num == reversed){
        println("$num is palindrome")
    }
    else{
        println("$num is not palindrome")
    }
}