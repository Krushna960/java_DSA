
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String fruit = input.next();
        // switch (fruit) {
        //     case "mango" -> System.out.println("Mango is a tropical fruit.");

        //     case "apple" -> System.out.println("Apple is a temperate fruit.");

        //     case "banana" -> System.out.println("Banana is a tropical fruit.");

        //     case "orange" -> System.out.println("Orange is a citrus fruit.");

        //     case "grape" -> System.out.println("Grape is a berry fruit.");

        //     default -> System.out.println("Unknown fruit.");

        // }

        int day = input.nextInt();
        switch (day) {
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
              System.out.println("It's a weekday.");
              break;    
           case 6:
           case 7:
                System.out.println("It's a weekend.");
               break;
               
              default:
                 System.out.println("Invalid day.");
                 break;
        }

    }
}
