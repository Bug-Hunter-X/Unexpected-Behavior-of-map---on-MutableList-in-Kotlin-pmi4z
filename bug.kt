fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val doubledList2 = list.map { it * 2 }
    println(doubledList2) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1,2,3,4,5)
    val doubledMutableList = mutableList.map {it * 2}
    println(doubledMutableList) // Output: [2, 4, 6, 8, 10]

    mutableList.add(6)
    println(mutableList) // Output: [1, 2, 3, 4, 5, 6]
    println(doubledMutableList) // Output: [2, 4, 6, 8, 10]
}