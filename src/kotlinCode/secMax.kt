
fun main() {
    val arr = intArrayOf(2,5,7,1,8,23,34)
    println(arr.contentToString())
    arr.sortDescending()
    println("second max in array is ${arr[1]}")
}
