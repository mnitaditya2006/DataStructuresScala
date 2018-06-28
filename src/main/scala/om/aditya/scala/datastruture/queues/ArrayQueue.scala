//this is the queue implementation using array  this is the linear implementation for the circular implementation pelase see the
//ArrayCircularQueue in the same package

package om.aditya.scala.datastruture.queues

class ArrayQueue[T:Manifest] extends Queue[T]{
  private var items : Array[T] = new Array[T](10)
  private var head = 0
  private var tail = 0
  private var count = 0
  private var flag : Boolean = false
  def isEmpty : Boolean = head == 0

  def enqueue(item:T) : Unit ={
    if(tail == items.length) {
      var temp =  new Array[T](items.length*2)
      for(i<-0 to  ( items.length - head)) {
        temp(i) = items(head -1 + i)

      }
      tail = items.length+1 - head
      head = 1
      items = temp
      flag = true
    } else if(isEmpty) {
           head = 1
    }

    items(tail) = item
    tail+=1
    count+=1

  }

  def dequeue : T =  {
    if(head==0 && !flag)  throw new Exception("Queue is Empty")
    var data = items(head-1)
    head+=1
    count-=1
    if(head  == tail) {
      head = 0
      tail = 0
    }
    data
  }

  def peek : T = items(head -1)

  def size : Int = count

}
