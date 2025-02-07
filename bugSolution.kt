fun main() {
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val keysToRemove = map.filter { it.key > 2 }.keys
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {1=one, 2=two}

    //Alternative solution using a new map
    val newMap = map.filter { it.key <=2 }
    println(newMap) // Output: {1=one, 2=two}
}    
