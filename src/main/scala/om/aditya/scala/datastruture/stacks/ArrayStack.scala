package om.aditya.scala.datastruture.stacks

class ArrayStack[T:Manifest] extends Stack[T]{

   var items =  new Array[T](10)
  private var count = 0
   var top = 0

  override def push(item: T): Unit = {
    if(top == items.length) {
      var temp = new Array[T](items.length*2)
      for(i <- 0 until items.length) temp(i) = items(i)
      items = temp

    }

      items(top) = item
      top+= 1

    count+=1
  }

  override def pop: T = {
    var data = items(top - 1)
    top = top -1
    count-=1
    data
  }

  override def peek: T = items(top-1)

  override def isEmpty: Boolean =  top == 0

  override def size: Int = count
}
