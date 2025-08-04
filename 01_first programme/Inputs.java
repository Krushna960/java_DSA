import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter roll no: ");
        int rollno = sc.nextInt();
        System.out.println("Roll Number: " + rollno);

        System.out.println("enter name");
        java.lang.String name = sc.next();
        System.out.println("Name: " + name);

        System.out.println("enter marks");
        float marks = sc.nextFloat();
        System.out.println("Marks: " + marks);


    }
}
