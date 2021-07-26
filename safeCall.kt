fun allCaps(s :String?) //to be evaluated
{
    val c: String?=s?.toUpperCase();  // Using the safe call operator 
    println(c)
}

fun main()
{
    allCaps(null)
    allCaps("Hello")
}

/*Output:
  null
  HELLO
 */