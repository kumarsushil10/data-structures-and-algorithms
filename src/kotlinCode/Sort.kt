package kotlinCode

fun main() {
    val arr = arrayOf(1, 5, 6, 7, 2, 24, 34, 45, 76, 24, 65, 0)
    println(sort(arr).contentToString())
}

fun sort(array: Array<Int>): Array<Int> {
    var count = 0
    for (i in array.indices) {
        for (j in 0 until array.size - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
            count++
        }
    }
    return array
}