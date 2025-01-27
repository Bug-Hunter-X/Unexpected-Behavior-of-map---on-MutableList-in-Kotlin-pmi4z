fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)

    // Instead of map, use a function that creates a live view.
    // This example uses a custom function for demonstration.
    // In a real-world scenario, you might need a more sophisticated solution.
    val doubledMutableList = mutableListOf<Int>()

    for (i in 0 until mutableList.size) {
        doubledMutableList.add(mutableList[i] * 2)
    }
    println(doubledMutableList) // Output: [2, 4, 6, 8, 10]

    mutableList.add(6)
    // Recompute the doubled list after modification
    doubledMutableList.clear()
    for (i in 0 until mutableList.size) {
        doubledMutableList.add(mutableList[i] * 2)
    }
    println(doubledMutableList) // Output: [2, 4, 6, 8, 10, 12]
    
    // Alternatively, consider using a computed property to update automatically
    val myList = mutableListOf(1,2,3)
    val doubleList: List<Int> get() = myList.map { it * 2 }
    println(doubleList) //[2,4,6]
    myList.add(4)
    println(doubleList) // [2,4,6,8]
} 