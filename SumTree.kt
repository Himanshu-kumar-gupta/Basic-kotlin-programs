import java.lang.IllegalArgumentException

interface Expr
class Num(val v:Int) : Expr
class Sum(val left:Expr,val right:Expr) :Expr
class  xy :Expr
fun main()
{
    println(eval(Sum(Sum(Num(1),Num(2)),Num(4))))
    println(evalWithLogging(Sum(Sum(Num(1),Num(2)),Num(4))))
    //println(eval(xy()))   //this throws exception as the else part in when is executed
    //println(evalWithLogging(xy()))
}

fun eval(e:Expr) : Int=
    when(e)
    {
        is Num ->   // when can be used to compare type
            e.v  //smart cast
        is Sum ->
            eval(e.left)+eval(e.right)
        else ->  throw IllegalArgumentException("Unknown  expression")
    }

fun evalWithLogging(e:Expr) :Int =
    when(e)
    {
        is Num -> {
            println("Num : ${e.v}")
            e.v //last statement gets returned in block body
        }
        is Sum -> {
            val f1 = evalWithLogging(e.left)
            val f2 = evalWithLogging(e.right)
            println("Sum : $f1 + $f2")
            f1+f2
        }
        else -> {
            throw IllegalArgumentException("Unknown  expression")
        }
    }