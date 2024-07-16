fun sunsetViews(buildings: List<Int>, direction: String): List<Int> {
    val result = mutableListOf<Int>()
    val start = if (direction == "EAST") buildings.size - 1 else 0
    val step = if (direction == "EAST") -1 else 1

    var maxHeight = 0
    var i = start
    while (i in buildings.indices) {
        if (buildings[i] > maxHeight) {
            result.add(i)
            maxHeight = buildings[i]
        }
        i += step
    }

    return if (direction == "EAST") result.reversed() else result
}

fun main() {
    val buildings1 = listOf(3, 5, 4, 4, 3, 1, 3, 2)
    val direction1 = "EAST"
    println(sunsetViews(buildings1, direction1))  // Output: [1, 3, 6, 7]

    val buildings2 = listOf(3, 5, 4, 4, 3, 1, 3, 2)
    val direction2 = "WEST"
    println(sunsetViews(buildings2, direction2))  // Output: [0, 1]
}


