fun strlen(s:String)=s.length

fun main(args:Array<String>)
{
    var n="golem"
    val k:String?="skls"

    // k.length  //cannot call library functions on nullable variables(use safeCall)
    // n=k  //typeMismatch - cannot assign value of simple variable to nullable variable 
    println("$n = ${strlen(n)}")
}
