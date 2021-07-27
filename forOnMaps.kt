import java.util.*

fun main()
{
    println("\nBinary representation of characters : ")
    val binaryReps = TreeMap<Char,String>()

    for (c in 'A'..'F') //in can be used with characters
    {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c]=binary  //assigning value to key in map
    }

    for ((letter,binary) in binaryReps) //letter gets key, binary gets value
        println("$letter = $binary")

    println("\nUsing for with index : ")
    val list = arrayListOf("hog","golem","yeti")
    for((index,element)in list.withIndex())
        println("$index : $element")
}