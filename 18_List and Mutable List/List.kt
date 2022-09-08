fun main() {
    //Number list
    val list=listOf(1,3,4,5,6,7,2,3,5)
    
    // Access elements of the list
    println("List of numbers: $list")
    println("Size: ${list.size}")
    println("First Element from get: ${list.get(0)}")
    println("First Element from []: ${list[0]}")
    println("Second Element: ${list[1]}") 
    println("Last index: ${list.size - 1}")
	println("Last element: ${list[list.size - 1]}")
    println("First from .first(): ${list.first()}")
    println("Last from .last(): ${list.last()}")
    
    // Use the contains() method
    println("\nContains 4? ${list.contains(4)}")
    println("Contains 10? ${list.contains(10)}")

    //String list
    val colors = listOf("green", "orange", "blue")
    println("\nList of String: $colors")
    //List are immutable
 	//Following lines give error
//     colors.add("purple")
//     colors[0]="yellow"
	
    
   	//Though list are immutable
   	//There are operations that can return new list
   	
    //Reversed list
    println("Reversed list string: ${colors.reversed()}")
    println("Reversed list numbers: ${list.reversed()}")
    
    //Sorted list
    println("Sorted list string: ${colors.sorted()}")
    println("Sorted list numbers: ${list.sorted()}")

}

//Output
//List of numbers: [1, 3, 4, 5, 6, 7, 2, 3, 5]
//Size: 9
//First Element from get: 1
//First Element from []: 1
//Second Element: 3
//Last index: 8
//Last element: 5
//First from .first(): 1
//Last from .last(): 5
//
//Contains 4? true
//Contains 10? false
//
//List of String: [green, orange, blue]
//Reversed list string: [blue, orange, green]
//Reversed list numbers: [5, 3, 2, 7, 6, 5, 4, 3, 1]
//Sorted list string: [blue, green, orange]
//Sorted list numbers: [1, 2, 3, 3, 4, 5, 5, 6, 7]
