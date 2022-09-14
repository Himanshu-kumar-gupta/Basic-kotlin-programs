fun main() { 
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    //Higher-Order fun take functions/lambda as a parameter     

    //sortedWith takes 2 parameters of same type and compares and sorts acc to them
    //-ve is for less than, 0 is for equal, +ve for greater than
    //Last expression is always returned as it is lambda
	println(peopleNames.sortedWith {str1:String,str2:String -> str1.length-str2.length})
}

// Output
// [Ann, Barbara, Fred, Joe]
// [Ann, Joe, Fred, Barbara]

