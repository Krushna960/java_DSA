import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(6);

        // System.out.println(heap.remove()); // Should print 8
        // System.out.println(heap.remove()); // Should print 6

        ArrayList<Integer> list = heap.heapsort();
        System.out.println(list);
    }
}
