package kotlinCode

fun main() {
    println("Hello World")
    val nums = intArrayOf(1, 2, 2, 3)
    isMonotonic(nums)
    println(isMonotonic(nums))
}

fun isMonotonic(nums: IntArray): Boolean {
    var incMonotonic = false
    var decMonotonic = false
    for (i in 0..<nums.size - 1) {
        if (nums[i] < nums[i + 1]) {
            incMonotonic = true
        } else if (nums[i] > nums[i + 1]) {
            decMonotonic = true
        }
        if (incMonotonic && decMonotonic) {
            return false
        }
    }
    return true
}