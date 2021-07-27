//in can be used to check if an element is in a range or not

fun isLetter(c:Char) = c in 'a'..'z' || c in 'A'..'Z' // internal working : a<=c && c<=z
fun isNotDigit(c :Char) = c !in '0'..'9' // !in returns true if an element is not in range

fun recognize(c:Char) =
    when(c){
        in '0'..'9' -> "A digit"
        in 'a'..'z',in 'A'..'Z' -> "A letter"
        else -> "Not Alphanumeric"
    }

fun main()
{
    println(isLetter('q'))
    println(isNotDigit('x'))
    println(recognize('5'))
    println(recognize('a'))
    println(recognize('@'))
}

