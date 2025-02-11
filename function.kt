fun main() {
   println(sumData1(1, 2))
   println(sumData2(1, 2))
   sumData3(1, 2)
} 

// Function return type
fun sumData1(a: Int, b: Int): Int {
    return a + b
}
// Function return type inferred
fun sumData2(a: Int, b: Int) = a + b
// Function return no meaningful value
fun sumData3(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${a + b}")
}

// Unit return type can be omitted
fun printlnSumData(a:Int, b: Int) = println("Sum of $a and $b is ${a + b}")
