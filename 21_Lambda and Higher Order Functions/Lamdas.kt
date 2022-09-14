fun main() { 
   // (Int) - function parameter
   // type after '->' is return type of lambda function 
   // statements after '->' is body of func
   // last statement in body is returned 
   val triple:(Int)->Int = {a:Int-> a*3}
   println(triple(5))
   
   //Can omit type in func body if specified in method type
   val triple11:(Int)->Int = {a-> a*3}
   println(triple11(6))
   
   //Can omit type in method if specified in body
   val triple12 = {a:Int -> a*3}
   println(triple12(7))
   
   //Cannot omit type in both method & body
//    val triple13 = {a-> a*3}   not valid

   //Can use 'it' for single variable functions
   val triple2:(Int)->Int = {it*3}
   println(triple2(8))
   
   //Can use '::'- functional pointer if body contains a single function
   val upperCase: (String) -> String = String::uppercase
    println(upperCase("Golem"))
}

// Output
// 15
// 18
// 21
// 24
// GOLEM
