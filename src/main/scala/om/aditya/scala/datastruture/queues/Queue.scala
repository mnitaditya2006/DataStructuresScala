package om.aditya.scala.datastruture.queues



/*this is trait for Queue */
trait Queue[T] {

  def isEmpty : Boolean
  def enqueue(item:T) : Unit
  def dequeue : T
  def peek : T
  def size : Int
}
