
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //syntax
        ArrayList <Integer> list = new ArrayList<>(10);
           
        // list.add(67);
            // list.add(63);
            // list.add(62);
            // list.add(621);
            // list.add(673);
            // list.add(6722);
            //  list.remove(3);

            // list.set(0,99);
            // System.out.println(list.contains(67));
            // System.out.println(list);

             for(int i=0;i<5;i++){
                list.add(in.nextInt());
             }

             for(int i=0;i<5;i++){
                System.out.println(list.get(i));
             }
           
    }
}
