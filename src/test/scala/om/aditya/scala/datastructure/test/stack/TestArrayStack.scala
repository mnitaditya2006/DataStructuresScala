package om.aditya.scala.datastructure.test.stack

import om.aditya.scala.datastruture.stacks.ArrayStack
import org.junit.{Before, Test}
import org.junit.Assert._

class TestArrayStack {

  var stack : ArrayStack[Int] = null

  @Before def createstack = {

    stack = new ArrayStack[Int]

  }

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

  /*@Test def testPushPop = {
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

  } */

    @Test def testPushPop100 = {
      for (i <- 0 until 100) {
        stack.push(i)
        println("a"+stack.items(stack.top-1) +":"+stack.top +":" +stack.items.length )

        assertTrue(stack.peek == i)
        assertTrue(stack.size == i + 1)
        assertTrue(!stack.isEmpty)
      }

     for (i <- 0 until 100) {
       println("b"+stack.items(stack.top-1) +":"+stack.top +":" +stack.items.length )
       assertTrue(stack.pop == 99 - i)
       assertTrue(stack.size == 99 - i)
        if (i == 99) {
          assertTrue(stack.isEmpty)
        }
        else {
          assertFalse(stack.isEmpty)
         // assertTrue(stack.peek ==  - i)
        }


      }

    }

}
