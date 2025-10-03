package staticExample;

//this is a demo to show initialisation of satic variables
public class staticBlock {
    static int a = 4;
    static int b;

    // will only run once, when the 1st obj is created i.e. when the class is loded for 2nd obj
    static {
        System.out.println("i am in ststic block");
        b = a * 5;
    }
    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);

        staticBlock.b += 3;
        System.out.println(staticBlock.a+" "+staticBlock.b);

        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);
    }
    
}
