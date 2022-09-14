fun main() {
    //Create map with string key and int value
    val peopleAges = mutableMapOf(
    "Hog" to 100,
    "Golem" to 80)
   
   	//Adding more elements
    peopleAges.put("Yeti",50)
    peopleAges["Goblin"] = 70
    
    //Changing an existing element
    peopleAges["Hog"] = 150
    println("Map = $peopleAges")
}

// Output
// Map = {Hog=150, Golem=80, Yeti=50, Goblin=70}
