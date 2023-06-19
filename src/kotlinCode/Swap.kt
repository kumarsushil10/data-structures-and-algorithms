
fun main(){
    var a = 4
    var b = 5
    println("a = $a ,b = $b")

    val temp = a
    a = b
    b = temp
    println("After Swap")
    println("a = $a ,b = $b")
}
