package ds.TheHeap;

import ds.TheHeap.heuristic.HeapHeuristic;
import ds.TheHeap.heuristic.MinHeap;

/**
 * Priority Queue with a Binary Heap backing. Ordered by lowest by default. Takes
 * a HeapHeuristic as a constructor parameter to order differently.
 * 
 * @author Ethan Gaebel (egaebel)
 *
 * @param <T>
 */
public class PriorityQueue<T extends Comparable<T>> {

    //~Constants----------------------------------------------
    /**
     * The default size to make the heap.
     */
    private final int DEFAULT_SIZE = 25;

    //~Data Fields--------------------------------------------
    /**
     * The heap that is backing this priority queue.
     */
    private HeapInterface<T> heap;

    //~Constructors--------------------------------------------
    /**
     * Default constructor. Will make this priority queue spit out
     * lowest values first. (lowest as determined via compareTo)
     */
    public PriorityQueue() {
        
        heap = new BinaryHeap<T>(new MinHeap<T>(), DEFAULT_SIZE);
    }
    
    /**
     * Constructor that takes a HeapHeuristic to determine the ordering of 
     * this Queue.
     * 
     * @param heuristic HeapHeuristic object used to determine the ordering of the queue.
     */
    public PriorityQueue(HeapHeuristic<T> heuristic) {
        
        heap = new BinaryHeap<T>(heuristic, DEFAULT_SIZE);
    }
    
    /**
     * Constructor that takes a size to set the underlying heap to initially.
     * Does ordering by the MinHeap heuristic (the smallest item goes out first).
     * Smallest being determined by the Comparable interface.
     * 
     * @param size the initial capacity of the underlying heap.
     */
    public PriorityQueue(int size) {
        
        heap = new BinaryHeap<T>(new MinHeap<T>(), size);
    }
    
    /**
     * Takes a HeapHeuristic to determine the ordering of this queue, and a size
     * to determine the initial capacity of the underlying heap.
     * 
     * @param heuristic HeapHeuristic object used to determine the ordering of the queue.
     * @param size the initial capacity of the underlying heap.
     */
    public PriorityQueue(HeapHeuristic<T> heuristic, int size) {
        
        heap = new BinaryHeap<T>(heuristic, size);
    }

    //~Methods-------------------------------------------------
    /**
     * Enqueue the element.
     * 
     * @param element the element to enqueue.
     */
    public void enqueue(T element) {
        
        heap.insert(element);
    }
    
    /**
     * Peek at the next element to be dequeued.
     * 
     * @return the next element in line to be dequeued.
     */
    public T peek() {
        
        return heap.getHead();
    }
    
    /**
     * Dequeue the next element, determiend by the heuristic used in ordering.
     * 
     * @return the element being dequeued.
     */
    public T dequeue() {
        
        return heap.deleteHead();
    }
    
    /**
     * Returns the number of elements in the queue.
     * 
     * @return the number of elements in the queue.
     */
    public int size() {
        
        return heap.size();
    }
    
    /**
     * Removes all elements.
     */
    public void clear() {
        
        heap.makeEmpty();
    }
}