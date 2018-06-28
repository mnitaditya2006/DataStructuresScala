import om.aditya.scala.datastruture.queues.ArrayQueue
import org.junit.Assert._
import org.junit.{Before, Test}

class TestArrayQueue {

var queue : ArrayQueue[Int] = null

  @Before def createQueue = {

    queue = new ArrayQueue[Int]
  }

  @Test def testEmptyCheck= {

    assertTrue(queue.isEmpty)
    assertTrue(queue.size ==0)
    //assertTrue(queue.dequeue == 0)

  }

  @Test def TestOneElement = {

    queue.enqueue(1)
    assertEquals(1,queue.size)
    assertEquals(1,queue.peek)
    //assertEquals(1,queue.head)
    assertFalse(queue.isEmpty)
    assertEquals(1,queue.dequeue)
    assertFalse(queue.isEmpty)

  }

  @Test def TestEnqueuDequeu() = {
    var j: Int = 0
    for (i <- 0 until 10) {
      queue.enqueue(i)
      assertTrue(queue.size == i + 1)
      assertTrue(!queue.isEmpty)
      assertTrue(queue.peek == 0)

    }

    for (i <- 0 until 10) {

      assertTrue(queue.size == 10 - i )
     // assertTrue(queue.head == i+1)
     /// assertEquals(queue.items(i),  i)
      //assertTrue(queue.peek == i)
      println(queue.dequeue)
      //assertTrue(queue.size == 9 - i)

      //}
    }
   // while(queue.head < 10 ) {
     // println(queue.dequeue)
     // println(queue.head)
    //}
  }
  }
