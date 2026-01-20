fun main(){
    var signal = "Yellow"

    when (signal){
        "Red" -> println("Stop")
        "Green" -> println("Go")
        "Yellow" -> println("Get Ready")
        else -> println("Invalid Signal")
    }
}