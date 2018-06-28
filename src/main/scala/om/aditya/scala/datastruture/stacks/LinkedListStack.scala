package om.aditya.scala.datastruture.stacks

class LinkedListStack[T] extends Stack[T] {

  private case class Node(var item: T , var next : Node)
  private var top : Node = _

  private var count = 0

  override def push(item: T): Unit = {

    if(isEmpty) {

      top = Node(item,null)
    } else {

      var temp = Node(item,null)

      temp.next = top
      top = temp
    }
    count+=1

  }

  override def pop: T = {

    var data = top.item
    top = top.next
    count-=1
    data
  }

  override def peek: T = top.item

  override def isEmpty: Boolean = top == null

  override def size: Int = count
}
