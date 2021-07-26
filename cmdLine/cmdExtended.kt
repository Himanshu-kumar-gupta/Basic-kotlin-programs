fun main(args:Array<String>){
    println("Hello , ${if(args.size>0)args[0] else "Kotlin"}")  // ${} syntax can be used on big expression
}                 //there can be double quotes within double quotes if the inner one is within an expression