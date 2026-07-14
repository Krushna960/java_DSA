
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Deque;
public class InBuildExamples {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);

        // System.out.println(stack.pop()); 

        //  Queue<Integer> queue = new LinkedList<>();
        //  queue.add(1);
        //  queue.add(2);
        //  queue.add(3);

        // System.out.println(queue.remove());   
        
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
