package DAY2

fun main() {
//    Array of Intergers
    val numbers = arrayOf(1,2,3,4,5)
//    Array of Strings
    val words : Array<String> = arrayOf("Kotlin", "Java", "InteliJ")
//    Array of squares using lambda function
    val squares = Array(5) {i -> i*i}




    words[2]="Mercer"


    println(words[words.size-1])



    for (x in words){
        println(x)
    }
}