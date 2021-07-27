/* if divisible by 3 => Fizz
*  if divisible by 5 => Buzz
*  if divisible by 3 & 5 => FizzBuzz */

fun fizzBuzz1(i:Int)=
    when{
        i%15==0 -> "FizzBuzz"
        i%3==0 -> "Fizz"
        i%5==0 -> "Buzz"
        else -> "$i"
    }

fun main()
{
    print("\n1 to 100 : \n ")
    for(i in 1..100)
    {
        print(fizzBuzz1(i)+"  ")
    }

    print("\n\n100 to 1 with even only : \n ")
    for (i in 100 downTo 1 step 2)
        print(fizzBuzz1(i)+"  ")
}

/* Output :
  1 to 100 :
 1  2  Fizz  4  Buzz  Fizz  7  8  Fizz  Buzz  11  Fizz  13  14  FizzBuzz  16  17  Fizz  19  Buzz  Fizz  22  23  Fizz  Buzz  26  Fizz  28  29
 FizzBuzz  31  32  Fizz  34  Buzz  Fizz  37  38  Fizz  Buzz  41  Fizz  43  44  FizzBuzz  46  47  Fizz  49  Buzz  Fizz  52  53  Fizz  Buzz  56
 Fizz  58  59  FizzBuzz  61  62  Fizz  64  Buzz  Fizz  67  68  Fizz  Buzz  71  Fizz  73  74  FizzBuzz  76  77  Fizz  79  Buzz  Fizz  82  83
 Fizz  Buzz  86  Fizz  88  89  FizzBuzz  91  92  Fizz  94  Buzz  Fizz  97  98  Fizz  Buzz

100 to 1 with even only :
 Buzz  98  Fizz  94  92  FizzBuzz  88  86  Fizz  82  Buzz  Fizz  76  74  Fizz  Buzz  68  Fizz  64  62  FizzBuzz  58  56  Fizz  52  Buzz
  Fizz  46  44  Fizz  Buzz  38  Fizz  34  32  FizzBuzz  28  26  Fizz  22  Buzz  Fizz  16  14  Fizz  Buzz  8  Fizz  4  2
*/