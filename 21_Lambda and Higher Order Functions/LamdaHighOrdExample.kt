fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
	val bFilteredWord= words.filter { it.startsWith("b", ignoreCase=true)}
    .shuffled()
    .take(2)
    .sorted()
    
    println(bFilteredWord)
    
    val cFilteredWord = words.filter { it.startsWith("c", ignoreCase=true)}
    .shuffled()
    .take(1)
    
    println(cFilteredWord)
}

//Output
// [balloon, best]
// [class]
