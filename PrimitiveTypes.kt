fun main() {
   val b : Byte = 5    //integer values primitive types
   val s : Short = 6
   val i : Int = 7    //default for integer values is 'Int'
   val l : Long = 12123243
   val l1 = 34354354L   //Long variable can also be declared by adding suffix L

   println("\n Byte = $b \n Short = $s \n Int = $i \n Long = $l \n ${l1 is Long}")

   //floating point primitive types
   val f : Float = 3.0F  //using F as suffix is necessary to declare float
   val d : Double = 5.0   //default for floating point is 'Double'
     //to specify double we need to use . else type-mismatch(6.0)

   println("\n Float = $f \n Double = $d")

   // val i: Int = b  //ERROR cannot convert Byte to Int implicitly
   val i1: Int = b.toInt()  //correct

   //If we change one of literal from literals of same type(integer/floating) then the whole literal is considered of the changed type
   val l2 = 1L + 3 // Long + Int => Long
   println(l2 is Long)

   val x = 5 / 2
   //println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
   println("${x == 2}  : ${x is Int}")  //true : true
   val x1 = 5 / 2.toDouble()
   println("${x1 == 2.5}  : ${x1 is Double} \n") // true : true

    /*All number types support conversions to other types:

    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
   */

   /*
   Underscores can be used to make number(Integer) constants more readable
   They are ignored by compiler
   Underscores at start and end are not permitted i.e. _4343_546 or 4343_546_ gives error
   They are not permitted in floating or any other literal(Only Integer)
   */
   println(123_324_324_424_23L)

   //Arithmetic Operators are same as java : +, -, *, /, %

   println("\n Operators :\n "+1 + 2)
   println(2_500_000_000L - 1L)
   println(3.14 * 2.71)
   println(10.0 / 3)
   println(5%3)

   //Booleans
   val myTrue: Boolean = true
   val myFalse = false
   println("\n Boolean : ${myTrue || myFalse} \n")

   /*
   Character
   The following escape sequences are supported :  \t, \b, \n, \r, \', \", \\ and \$
   */
   val aChar = 'a'
   println("Character  : $aChar")
   println('\n') //prints an extra newline character
   println('\uFF00')

    /* There are two types of strings in java
    *  1.escaped strings- similar to java where escape sequence are allowed(double quotes "  ")
    *  2.raw string - where escaped sequence are not allowed, and it prints exactly what its inside is
    *    raw string is in triple quotes """      """
    */
    val simple = "Himanshu"
    val raw1 ="""
              golu
                  how
                  are   /you
                   doing?
    """
    println("\n $simple \n")
    println(raw1)

    //trimMargin removes whitespace in a line before the trim character
    //default trim character is '|'
    val raw2 = """ golu 
        | how 
        | are 
        | you """.trimMargin()
    println(raw2)

   //any other character can be used in trimMargin
   val test = """
      *
      *I am line one 
      *  *I am line two 
      *I am line Three """.trimMargin("*")
   println(test)
}

/*   Output :

Byte = 5
 Short = 6
 Int = 7
 Long = 12123243
 true

 Float = 3.0
 Double = 5.0
true
true  : true
true  : true

12332432442423

 Operators :
 12
2499999999
8.5094
3.3333333333333335
2

 Boolean : true

Character  : a


＀

 Himanshu


              golu
                  how
                  are   /you
                   doing?

 golu
 how
 are
 you

I am line one
  *I am line two
I am line Three

*/