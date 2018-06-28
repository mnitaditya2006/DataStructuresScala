import om.aditya.scala.datastruture.queues.ArrayCircularQueue
import org.junit.Assert._
import org.junit.{Before, Test}

class TestArrayCircularQueue {

  var queue : ArrayCircularQueue[Int] = _

  @Before def createQueue = {

    queue = new ArrayCircularQueue[Int]
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
    assertFalse(queue.isEmpty)
    assertEquals(1,queue.dequeue)
    assertTrue(queue.isEmpty)

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
      assertTrue(queue.peek == i)
      assertEquals(queue.dequeue , i)

    }

  }
}
