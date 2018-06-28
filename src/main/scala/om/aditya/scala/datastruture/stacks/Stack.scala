package om.aditya.scala.datastruture.stacks

trait Stack[T] {

  def push(item:T) :Unit
  def pop : T
  def peek : T
  def isEmpty : Boolean
  def size : Int

}
