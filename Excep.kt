import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun main(){
    val number = 10
    val percentage =
        if (number in 1..100)
            number
        else
            throw IllegalArgumentException("A percentage value must be between 0 and 100 : $number")
              //here throw is an expression
    println(percentage)

    var reader = BufferedReader(StringReader("34543548"))
    println(readNumber(reader))  //this reader is closed in this function , a new reader(value changed) is used for another function

    reader = BufferedReader(StringReader("hello"))
    readNumber1(reader)
}

 //try-catch block is always in curly braces
fun readNumber(reader: BufferedReader): Int? { // no need to throw IOException or other exceptions explicitly in kotlin
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e : NumberFormatException){
        return null
    }
    finally {   //finally block does not function as a expression and no value can be assigned from it
       reader.close()  //this closes the reader due to which a new reader(value changed) is used for another function
    }
}

fun readNumber1(reader: BufferedReader){
    val number = try{   //try is used as expression
        Integer.parseInt(reader.readLine())
    }catch (e : NumberFormatException){
        return    //the function ends here hence nothing is printed if not a number
        //null   // uncomment & comment above line to assign null to number and print it
    }

    println(number)
}

/* Output :
   10
   34543548
*/