import om.aditya.scala.datastruture.queues
import om.aditya.scala.datastruture.queues.LinkedListQueue
import org.junit.Before
//import junit.framework.Test
import  org.junit.Assert._
import org.junit.Test
class TestLinkedQueue {
   var queue : LinkedListQueue[Int] = null

  @Before def createQueue: Unit = {
    queue = new LinkedListQueue[Int]
  }
  @Test def TestEmpty(): Unit = {
   // val emptyQueue = new LinkedListQueue[Int]
    assertTrue(queue.isEmpty)
  }

  @Test def TestOnlyOneElement() = {
    queue.enqueue(10)
    assertFalse(queue.isEmpty)
    assertTrue(queue.peek == 10)
    assertTrue(queue.size == 1)
    assertTrue(queue.dequeue == 10)
    assertTrue(queue.size == 0)

  }

  @Test def TestEnqueuDequeu() ={
     var j : Int = 0
    for(i<-0 until 10) {
      queue.enqueue(i)
      assertTrue(queue.size == i+1)
      assertTrue(!queue.isEmpty)
      assertTrue(queue.peek==0)

    }

    for(i <- 0 until 10) {
      j= queue.dequeue

      assertTrue(j == i)
      assertTrue(queue.size == 9 - i)

    }


  }


}
