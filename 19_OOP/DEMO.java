public class DEMO {
    public static void main(String[] args) {
       //just declaring a reference variable of type student
        student s1;
        
        //creating an object of type student
        s1 = new student(12,"tony",45); //dynamic memory allocation

        //student s1 = new student(); //declaration + memory allocation

        // s1.name = "John";
        // s1.rno = 101;
        // s1.marks = 95.5f;


        // s1.Greeting();


        student s2 = new student();
        System.out.println(s2.name);

        System.out.println(s1.name); 
        System.out.println(s1.rno); 
        System.out.println(s1.marks); 

        
        student one = new student();
        student two = one;

        one.name = "someting something";
        System.out.println(two.name);

    }
   
} 
class student {
        String name;
        int rno;
        float marks;

        //we need a way to add the values of the above
        //properties to the object
        //we can do that by creating a method

    void Greeting() {
        System.out.println("hello! my name is " + name);
    }

    student() {
        //this is how you call constructor from another constructor
        //internally the compiler converts this to
        this(13,"default",45.0f);
    }
     student(int roll, String name, float marks) {
         this.name = name;
         this.rno = roll;
         this.marks = marks;
        
        
    }
}