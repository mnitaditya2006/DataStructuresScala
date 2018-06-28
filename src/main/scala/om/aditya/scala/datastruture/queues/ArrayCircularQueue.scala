package om.aditya.scala.datastruture.queues

class ArrayCircularQueue[T:Manifest] extends Queue[T] {

  private var items: Array[T] = new Array[T](10)
  private var head = 0
  private var tail = 0
  private var count = 0

  override def isEmpty: Boolean = head == tail

  override def enqueue(item: T): Unit = {

    //when queue is full the create bigger queue
    if((tail+1)%items.length == head ) {
      var temp = new Array[T](items.length*2)
      for(i<-0 until items.length - 1) {
          temp(i) = items((head+i)%items.length)

      }
      head = 0
      tail = items.length - 1
      items = temp
    }

    items(tail )  = item
    tail = (tail+1)%items.length
    count+=1

  }

  override def dequeue: T = {
    var data = items(head)
    head = (head+1)%items.length
    count-=1
    data
  }

  override def peek: T = items(head)

  override def size: Int = count
}
