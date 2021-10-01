import kotlin.random.Random

    fun main(args: Array<String>) {

        val rng = Random(System.nanoTime()) // generate random number

        val x0 = rng.nextDouble() // generate random double number for variable x0
        val x1 = rng.nextDouble() // generate random double number for variable x1
        val x2= rng.nextDouble() // generate random double number for variable x2

        val numbers: List<Double> = listOf(x0, x1) // variable numbers as a list with double numbers containing x0 and x1 vars
        val numbers2: List<Double> = listOf(x0 + x1) // list containing the sum of x0 and x1
        val numbers3: List<Double> = listOf(x0 + x1 + x2) // list containing sum of all variables

        val lists: List<Double> = concatenate<Double>(numbers, numbers2, numbers3) // concatenating all lists into one list

        println("Queue: $numbers") // prints first var
        println("x0 + x1: $numbers2") // second var
        println("(x0 + x1) + x2: $numbers3") // third var
        println("New Queue: $lists") // prints the list of all lists

        for (items in lists) {
            val min = lists.minOrNull()  // gets the minimum number of all lists
            val minList: List<Double?> = listOf(min) // puts this number in a double list
            println("Minimum number in the New Queue: $minList") // prints the list
        } // for loop

        for (items in lists) {
            val max = lists.maxOrNull() // same as before but with the maximum number
            val maxList: List<Double?> = listOf(max)
            println("Maximum number in the New Queue: $maxList")
        }

        for (items in lists) {
            val mean = lists.average() // same as before but with the mean number
            val meanList: List<Double?> = listOf(mean)
            println("Average number between all numbers: $meanList")
        }

    }

fun <Double> concatenate(vararg lists: List<kotlin.Double>): List<kotlin.Double> {
    return listOf(*lists).flatten() // double concatenate function  which returns the list
}

// do not know why it is printing a repeated 4 times of each output.
