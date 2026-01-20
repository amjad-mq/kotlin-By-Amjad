class Car {
    var speed = 100
    fun drive (){
        println("Driving at $speed")
    }
}

val car1 = Car()

data class User(val name: String, val age: Int)
val u = User("Amjad", 20)

interface Drivable {
    fun drive()
}
class Car : Drivable {
    override fun drive() = println("Car is driving")
}


interface Human {
    fun name()
}

class Employee : Human {
    override fun name() = println ("Employee Name")
    fun add(a: Int, b: Int) = a + b
fun add(a: Double, b: Double) = a + b

}

abstract class Vehicle {
    abstract fun drive()
}
class Car : Vehicle() {
    override fun drive() = println("Driving a car")
}

class Person {
    var age: Int = 0
        get() = field
        set(value) { if(value > 0) field = value }
}
