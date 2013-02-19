package ds.TheHeap.heuristic;


public class MinHeap<T extends Comparable<T>> implements HeapHeuristic<T> {

    //~Constants----------------------------------------------


    //~Data Fields--------------------------------------------


    //~Constructors--------------------------------------------


    //~Methods-------------------------------------------------

    @Override
    public int heuristic(T element1, T element2) {

        return element1.compareTo(element2);
    }

    @Override
    public String printHeuristic() {

        return "MinHeap heuristic:\nelement1.compareTo(element2)";
    }
}
