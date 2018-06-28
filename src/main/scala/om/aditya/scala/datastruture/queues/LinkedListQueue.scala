package om.aditya.scala.datastruture.queues

import scala.runtime.Nothing$


class LinkedListQueue[T] extends Queue[T] {

  private class Node(var item: T , var nextNode: Node)
  private var count = 0
  private var head:Node = null
  private var tail:Node = null

  def isEmpty : Boolean = head==null
  def enqueue(item:T) : Unit = {
    if(isEmpty) {
      head=new Node(item,null)
      tail=head
    } else {
      tail.nextNode = new Node(item,null)
      tail = tail.nextNode
    }
    //adding 1 to the queue size
    count+=1
  }

  def dequeue : T ={

      var data = head.item
      head = head.nextNode
      count-=1
      data

  }

  def peek : T = head.item
  def size : Int = count
}
