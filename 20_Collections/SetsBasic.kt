fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   $numbers")
	println("sorted: ${numbers.sorted()}")
    
    //Convert list to set
	val setOfNumbers = numbers.toSet()
    println("Set of numbers: $setOfNumbers")
    
    //Check if sets differ by order of elements passed
    val set1 = setOf(1,2,3)
	val set2 = mutableSetOf(3,2,1)
	println("$set1 == $set2: ${set1 == set2}")
	println("Contains 7? ${setOfNumbers.contains(7)}")
    
    //Union of two sets
    println("Union of $setOfNumbers and $set1 = ${setOfNumbers.union(set1)}")
    
    //Intersection of two sets
    println("Intersection of $setOfNumbers and $set1 = ${setOfNumbers.intersect(set1)}")
}


//Output
//list:   [0, 3, 8, 4, 0, 5, 5, 8, 9, 2]
//sorted: [0, 0, 2, 3, 4, 5, 5, 8, 8, 9]
//Set of numbers: [0, 3, 8, 4, 5, 9, 2]
//[1, 2, 3] == [3, 2, 1]: true
//Contains 7? false
//Union of [0, 3, 8, 4, 5, 9, 2] and [1, 2, 3] = [0, 3, 8, 4, 5, 9, 2, 1]
//Intersection of [0, 3, 8, 4, 5, 9, 2] and [1, 2, 3] = [3, 2]
