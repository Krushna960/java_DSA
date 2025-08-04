public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "kunal";

        {
            //int a=78;//already initialized outside this block in the same scope
            a = 50; //reassigning value to 'a' in the same scope
            System.out.println(a);
            int c = 30; //c is declared in this block, will remain in the block
            name ="rahul";
            System.out.println(name);
        }
        System.out.println(name); 
        System.out.println(a);
       // System.out.println(c);//c is not accessible here, it was declared in the inner block
   
      //scope in for loop
          for (int i = 0; i < 5; i++) {
                int j = 10; //j is declared in the for loop scope
                System.out.println("i: " + i + ", j: " + j);
            }
            //System.out.println(j); //j is not accessible here, it was declared in the for loop scope
    
            //scope in methods
            int marks = 90;
            random(marks);   
    }
    

    static void random(int marks){

    }
}
