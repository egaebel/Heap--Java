package ds.TheHeap.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import ds.TheHeap.PriorityQueue;


public class PriorityQueueTest {

    @Test
    public void test() {

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.enqueue(13);
        q.enqueue(133);
        q.enqueue(43);
        q.enqueue(23);
        q.enqueue(87);
        q.enqueue(66);
        q.enqueue(-33);
        q.enqueue(24);
        assertTrue(q.dequeue() == -33);
        assertTrue(q.dequeue() == 13);
        assertTrue(q.dequeue() == 23);
        assertTrue(q.dequeue() == 24);
        assertTrue(q.dequeue() == 43);
        assertTrue(q.dequeue() == 66);
        assertTrue(q.dequeue() == 87);
        assertTrue(q.dequeue() == 133);
    }

    //~Constants----------------------------------------------


    //~Data Fields--------------------------------------------


    //~Constructors--------------------------------------------


    //~Methods-------------------------------------------------
}
