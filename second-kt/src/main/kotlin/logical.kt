fun main() {
    println("How many items")
    val a = readLine()
    val priceofa = 10
    try {
        println("Total ${a!!.toInt()!!.times(priceofa)}")
    }  catch (e: Exception) {

        println("Error in code")

    }
}



