// for loop with range 

for(i in 1..5){
    println("Count: $i)
}

// for loop with steps

for(i in 1..10 step 2){
    println("odd: $i")
}

//for loop over array

val fruits = arrayOf("Apple", "Banana", "Cherry")

for( fruit in fruits){
    println(fruit)
}

// while loop 

    var count = 1
    while( count <= 3) {
        println("While count: $count")
        count++
    }

    // do while loop

    var num = 1

    do {
        println("Do-while num: $num)
        num++
    } while (num <= 3)