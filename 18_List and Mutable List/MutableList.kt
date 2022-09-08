fun main() {
    //Following lines create error
    //As type cannot be automatically inferred
//     val entrees=mutableListOf()
    
    //Type can be automatically inferred from below lines
    //This is same for list
    val entrees=mutableListOf<String>()
    val entrees2:MutableList<String> = mutableListOf()
    val entrees3=mutableListOf("Hog Rider")
    
    println("Entrees: $entrees")
    
    // Add individual items using add()
    println("Add noodles : ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
	println("Entrees: $entrees")
    
    //List of more items
    val moreItems=listOf("ravioli", "lasagna", "fettuccine")
    
    // Add a list of items using addAll()
    println("\nAdd list to Mutable list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
    
    // Remove an item using remove()
    println("\nRemove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
	println("Entrees: $entrees")
    
    // Remove an item using removeAt() with an index
    println("Remove element at 1 position: ${entrees.removeAt(1)}")
    println("Entrees: $entrees")
    
    // Clear out the list
    println("Clearing the whole mutableList....")
    entrees.clear()
    println("Entrees: $entrees")
    
    // Check if the list is empty
    println("Empty? ${entrees.isEmpty()}")

}

//Output
//Entrees: []
//Add noodles : true
//Entrees: [noodles]
//Add spaghetti: true
//Entrees: [noodles, spaghetti]
//
//Add list to Mutable list: true
//Entrees: [noodles, spaghetti, ravioli, lasagna, fettuccine]
//
//Remove spaghetti: true
//Entrees: [noodles, ravioli, lasagna, fettuccine]
//Remove item that doesn't exist: false
//Entrees: [noodles, ravioli, lasagna, fettuccine]
//Remove element at 1 position: ravioli
//Entrees: [noodles, lasagna, fettuccine]
//Clearing the whole mutableList....
//Entrees: []
//Empty? true
