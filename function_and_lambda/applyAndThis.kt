fun main(){
    var name: String? = "Amjad"

    name?.let{
        println("Inside let: Name is $it and its length is ${it.length}")
    }

    val nullName: String? = null
    nullName?.let {
        println("This won't run because the object is null")
    }

    class Student {
        var name: String = ""
        var age: Int = 0
    }

    var student = Student().apply {
        name = "ABC"
        age = 21
    }

    println("Inside apply: Student ${student.name} is ${student.age} years old")
}