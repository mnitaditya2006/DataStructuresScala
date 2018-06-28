package om.aditya.scala.datastructure.test.stack
import om.aditya.scala.datastruture.stacks.LinkedListStack
import org.junit.{Before, Test}
import org.junit.Assert._

class TestLinkedStack {

  private var stack : LinkedListStack[Int] = null

  @Before
   def createList  = { stack = new LinkedListStack[Int] }

    @Test def testEmptyStack =  {

    assertTrue(stack.isEmpty)
    assertTrue(stack.size==0)
  }

  @Test def testSingleElement = {

    stack.push(1)
    assertTrue(stack.peek == 1)
    assertTrue(!stack.isEmpty)
    assertTrue(stack.size ==1)
    assertTrue(stack.pop == 1)
    assertTrue(stack.isEmpty)
    assertTrue(stack.size ==0)

  }

  @Test def testPushPop = {
    for (i <- 0 until 10) {
      stack.push(i)
      assertTrue(stack.peek == i)
      assertTrue(stack.size == i + 1)
      assertTrue(!stack.isEmpty)
    }

    for (i <- 0 until 10) {
      assertTrue(stack.pop == 9 - i)
      assertTrue(stack.size == 9 - i)
      if (i == 9) {
        assertTrue(stack.isEmpty)
      }
      else {
        assertFalse(stack.isEmpty)
        assertTrue(stack.peek == 8 - i)
      }


    }
  }
}



