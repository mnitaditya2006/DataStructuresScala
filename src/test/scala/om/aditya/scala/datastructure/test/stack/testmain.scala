package om.aditya.scala.datastructure.test.stack

object testmain {

  def main(args: Array[String]): Unit = {

    case class Node(var item: Int , var next : Node )

    var top  = Node(1,null)
    var temp = Node(2,null)

    temp.next = top
    top = temp

    println("top : " +top +",temp " +temp )
    println("top.next: " +top.next)
    println("temp.next" +temp.next)
  }

}
