import Color.*   //to use RED instead of Color.RED

enum class Color {   //enum is set of constants
    RED,ORANGE,GREEN,YELLOW,BLUE,INDIGO,VIOLET
}

fun main()
{
    println(Color.RED)
    println(Color1.BLUE.rgb())
    println(Color1.BLUE)
    println(Color1.INDIGO.rgb())
    println(mnemonic(Color.BLUE))
    println(getWarmth(Color.GREEN))
    println(mix(BLUE, VIOLET))
} 

fun mnemonic(color:Color) =
    when(color){
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN->"Gave"
        Color.BLUE->"Battle"
        Color.INDIGO->"In"
        Color.VIOLET->"Vain"
    } 
    
enum class Color1(val r:Int,val g:Int,val b:Int) {
    RED(255,0,0),ORANGE(255,165,0),YELLOW(255,255,0),GREEN(0,255,0),BLUE(0,0,255),INDIGO(75,0,130),VIOLET(238,130,238);  //constants made with constructor variables

    fun rgb() =(r*256+g)*256+b    //functions can be made on enums
}

fun getWarmth(c:Color)=
    when(c)
    {
        RED,ORANGE,YELLOW->"warm"   //via import statement
        GREEN -> "neutral"
        BLUE , INDIGO , VIOLET -> "cold"
    }

fun mix(c1:Color,c2:Color)=
    when(setOf(c1,c2)){
        setOf(RED,YELLOW) -> ORANGE
        setOf(YELLOW,BLUE)-> GREEN
        setOf(BLUE,VIOLET)-> INDIGO
        else -> throw Exception("Dirty color")
    }    

    /*Output :
    
    RED
    255
    BLUE
    4915330
    Battle
    neutral
    INDIGO*/