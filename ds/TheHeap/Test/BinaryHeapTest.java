package ds.TheHeap.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ds.TheHeap.BinaryHeap;
import ds.TheHeap.HeapInterface;
import ds.TheHeap.heuristic.MaxHeap;
import ds.TheHeap.heuristic.MinHeap;


public class BinaryHeapTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testInsert() {

        System.out.println("MAX HEAP HEURISTIC FOR ADD STARTS HERE");
        //MaxHeapHeuristic
        HeapInterface<Integer> heap = new BinaryHeap<Integer>(new MaxHeap<Integer>());
        heap.insert(77);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(33);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(47);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(22);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(4);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(-77);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(2222222);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        
        System.out.println("MIN HEAP HEURISTIC TESTING FOR ADD STARTS HERE!!");
        //MinHeapHeuristic
        heap = new BinaryHeap<Integer>(new MinHeap<Integer>());
        heap.insert(77);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(33);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(47);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(22);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(4);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(-77);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
        heap.insert(2222222);
        System.out.println(heap.printHeap());
        System.out.println("***************************************************************");
    }
    
    @Test
    public void testSize() {
        
        HeapInterface<Integer> heap = new BinaryHeap<Integer>(new MaxHeap<Integer>());
        heap.insert(66);
        heap.insert(667);
        heap.insert(62);
        heap.insert(82);
        heap.insert(36);
        heap.insert(56);
        heap.insert(96);
        heap.insert(106);
        heap.insert(26);
        heap.insert(16);
        heap.insert(23);
        heap.insert(64);
        heap.insert(69);
        heap.insert(66);
        heap.insert(66);
        heap.insert(66);
        heap.insert(123);
        heap.insert(222);
        heap.insert(22);
        assertEquals(heap.size(), 19);
        heap.insert(2);
        
        assertEquals(heap.size(), 20);
        
        System.out.println(heap.printHeap());
    }

    @Test
    public void testFindTheElement() {

        HeapInterface<Integer> heap = new BinaryHeap<Integer>(new MinHeap<Integer>());
        heap.insert(66);
        heap.insert(667);
        heap.insert(62);
        heap.insert(82);
        heap.insert(36);
        heap.insert(56);
        heap.insert(96);
        heap.insert(106);
        heap.insert(26);
        heap.insert(16);
        heap.insert(23);
        heap.insert(64);
        heap.insert(69);
        heap.insert(66);
        heap.insert(66);
        heap.insert(66);
        heap.insert(123);
        heap.insert(222);
        heap.insert(22);
        heap.insert(2);
        heap.insert(-333);
        
        assertTrue(heap.getHead() == -333);
        heap.deleteHead();
        assertTrue(heap.getHead() == 2);
    }

    @Test
    public void testDeleteTheElement() {

        System.out.println("MAX HEAP HEURISTIC FOR DELETE STARTS HERE");
        //Max Heap Tests
        HeapInterface<Integer> heap = new BinaryHeap<Integer>(new MaxHeap<Integer>());
        heap.insert(66);
        heap.insert(667);
        heap.insert(62);
        heap.insert(82);
        heap.insert(36);
        heap.insert(56);
        heap.insert(96);
        heap.insert(106);
        heap.insert(26);
        heap.insert(16);
        heap.insert(23);
        heap.insert(64);
        heap.insert(69);
        heap.insert(66);
        heap.insert(66);
        heap.insert(66);
        heap.insert(123);
        heap.insert(222);
        heap.insert(22);
        heap.insert(2);
        System.out.println(heap.printHeap());
        
        System.out.println("AFTER DELETING 667");
        assertTrue(heap.deleteHead() == 667);
        
        System.out.println(heap.printHeap());
        
        
        
        System.out.println("MIN HEAP HEURISTIC FOR DELETE STARTS HERE");
        //Min Heap Tests
        heap = new BinaryHeap<Integer>(new MinHeap<Integer>());
        heap.insert(66);
        heap.insert(667);
        heap.insert(62);
        heap.insert(82);
        heap.insert(36);
        heap.insert(56);
        heap.insert(96);
        heap.insert(106);
        heap.insert(26);
        heap.insert(16);
        heap.insert(23);
        heap.insert(64);
        heap.insert(69);
        heap.insert(66);
        heap.insert(66);
        heap.insert(66);
        heap.insert(123);
        System.out.println(heap.printHeap());
        
        assertTrue(heap.deleteHead() == 16);
        System.out.println("AFTER DELETING 16");
        System.out.println(heap.printHeap());
        
        assertTrue(heap.deleteHead() == 23);
        System.out.println("AFTER DELETING 23");
        System.out.println(heap.printHeap());
        
        assertTrue(heap.deleteHead() == 26);
        System.out.println("AFTER DELETING 26");
        System.out.println(heap.printHeap());
        
        assertTrue(heap.deleteHead() == 36);
        System.out.println("AFTER DELETING 36");
        System.out.println(heap.printHeap());
        
        assertTrue(heap.deleteHead() == 56);
        System.out.println("AFTER DELETING 56");
        System.out.println(heap.printHeap());
        
        heap.deleteHead();
        heap.deleteHead();
        heap.deleteHead();
        heap.deleteHead();
        
        System.out.println("AFTER DELETING 4 more items");
        System.out.println(heap.printHeap());
        
        heap.deleteHead();
        heap.deleteHead();
        heap.deleteHead();
        heap.deleteHead();
        
        System.out.println("AFTER DELETING 4 more items");
        System.out.println(heap.printHeap());
        
        heap.deleteHead();
        heap.deleteHead();
        heap.deleteHead();
        heap.deleteHead();
        
        System.out.println("AFTER DELETING 4 more items");
        System.out.println(heap.printHeap());
        
        heap.deleteHead();
        heap.deleteHead();
        heap.deleteHead();
        heap.deleteHead();
        
        System.out.println("AFTER DELETING 4 more items");
        System.out.println(heap.printHeap());
    }

    @Test
    public void testIsEmpty() {

        HeapInterface<Integer> heap = new BinaryHeap<Integer>(new MaxHeap<Integer>());
        heap.insert(66);
        heap.insert(667);
        heap.insert(62);
        heap.insert(82);
        heap.insert(36);
        heap.insert(56);
        heap.insert(96);
        heap.insert(106);
        heap.insert(26);
        heap.insert(16);
        heap.insert(23);
        heap.insert(64);
        heap.insert(69);
        heap.insert(66);
        heap.insert(66);
        heap.insert(66);
        heap.insert(123);
        heap.insert(222);
        heap.insert(22);
        assertEquals(heap.size(), 19);
        heap.insert(2);
        
        assertEquals(heap.size(), 20);
        
        System.out.println(heap.printHeap());
        
        assertFalse(heap.isEmpty());
        heap.makeEmpty();
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testMakeEmpty() {

        HeapInterface<Integer> heap = new BinaryHeap<Integer>(new MaxHeap<Integer>());
        heap.insert(66);
        heap.insert(667);
        heap.insert(62);
        heap.insert(82);
        heap.insert(36);
        heap.insert(56);
        heap.insert(96);
        heap.insert(106);
        heap.insert(26);
        heap.insert(16);
        heap.insert(23);
        heap.insert(64);
        heap.insert(69);
        heap.insert(66);
        heap.insert(66);
        heap.insert(66);
        heap.insert(123);
        heap.insert(222);
        heap.insert(22);
        assertEquals(heap.size(), 19);
        heap.insert(2);
        
        assertEquals(heap.size(), 20);
        
        System.out.println(heap.printHeap());
        
        heap.makeEmpty();
        
        System.out.println(heap.printHeap());
        assertEquals(heap.size(), 0);
    }
}