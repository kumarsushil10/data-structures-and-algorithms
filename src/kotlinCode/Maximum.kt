fun main() {
    val arr = arrayOf(1, 5, 6, 7, 2, 24, 34, 45, 76, 24, 65, 0)
    println(max(arr))
}

fun max(array: Array<Int>): Int {
    var max = 0
    for (i in array.indices) {
        if (array[i] >= max) {
            max = array[i]
        }
    }
    return max
}

