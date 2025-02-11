fun main() {
    whenFunction(5)
}

fun whenFunction(day: Int) {
    var result =
            when (day) {
                1 -> "Monday"
                2 -> "Tuesday"
                3 -> "Wednesday"
                4 -> "Thursday"
                5 -> "Friday"
                6 -> "Saturday"
                7 -> "Sunday"
                else -> "Invalid day"
            }
    println(result)
}
