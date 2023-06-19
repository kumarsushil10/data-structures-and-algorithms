
fun main() {
    val size = 4
    for (i in 1..size){
        for (j in 1..size){
            if(j <=(size-i)){
                print(j)
            }else{
                print('*')
            }
        }
        println()
    }
}