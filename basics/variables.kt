fun main() {

    println("===== KOTLIN VARIABLES =====\n")

    // 1) val vs var
    println("1) val vs var")
    val name = "Amjad"      // Immutable (cannot be changed)
    var age = 20            // Mutable (can be changed)
    println("Name: $name")
    println("Age before change: $age")
    age = 21
    println("Age after change: $age\n")

    // 2) Type Inference
    println("2) Type Inference")
    val city = "Sahiwal"    // Kotlin automatically detects String
    var score = 95          // Int
    var percentage = 89.5   // Double
    println("City: $city")
    println("Score: $score")
    println("Percentage: $percentage\n")

    // 3) Explicit Data Types
    println("3) Explicit Data Types")
    val university: String = "University of Sahiwal"
    val cgpa: Double = 3.80
    val isStudent: Boolean = true
    val grade: Char = 'A'
    println("University: $university")
    println("CGPA: $cgpa")
    println("Is Student: $isStudent")
    println("Grade: $grade\n")

    // 4) Mutable Example
    println("4) Mutable Example")
    var balance = 1000
    println("Initial Balance: $balance")
    balance += 500
    println("Balance after deposit: $balance")
    balance -= 200
    println("Balance after withdrawal: $balance\n")

// 5) Nullable Variables
println("5) Nullable Variables")
var email: String? = null
println("Email before assignment: $email")
email = "amjadmq2005@gmail.com"
println("Email after assignment: $email")

// 6) Safe Call (optional here, warning removed)
println("Email length: ${email.length}")

// 7) Elvis Operator (not needed here, just for demo)
val lengthOrZero = email.length
println("Email length (with Elvis): $lengthOrZero")


    // 8) Lateinit Variable
    println("8) Lateinit Variable")
    lateinit var course: String
    course = "Kotlin Programming"
    println("Course: $course\n")

    // 9) Constants
    println("9) Constants")
    println("PI Value: $PI")
    println("App Name: $APP_NAME")

    println("\n===== END OF VARIABLES =====")
}

// Constants (outside main)
const val PI = 3.1416
const val APP_NAME = "Kotlin Learning App"
