


class LinkedList {

    class NodeList(var value: Any) {
        var next: NodeList? = null
    }
    var head :NodeList? = null


    fun insert(value: Any) {
       head?.value  = value
        head?.next = head
    }
    fun iterate(){
        while (head != null){
            println(head!!.value)
            head = head!!.next
        }
    }


}
fun main(){
    val list = LinkedList()
    list.insert(3)
    list.insert(4)

    list.iterate()
}