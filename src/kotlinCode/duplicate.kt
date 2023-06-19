
fun main(){
    val str = "sushil"
    if (isDuplicate(str)){
        println("yes")
    }else{
        println("no")
    }
}
fun isDuplicate(string: String): Boolean {
    val char = string.toCharArray()
    for(i in char.indices){
        for (j in i+1 until char.size){
            if (char[i] == char[j]){
                return true
            }
        }
    }
    return false
}