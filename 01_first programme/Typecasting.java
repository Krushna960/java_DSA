import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float num = input.nextFloat();  
        System.out.println(num);//if inpust is integer, it will be converted to float

        //explicit typecasting from float to int
        int num1 = (int)(67.965f);
        System.out.println(num1); //explicit typecasting from float to int

        //automatic type promotion in expressions
        int a =257;
        byte b = (byte)(a); //int to byte, explicit typecasting
        System.out.println(b); //output will be 1, as byte can hold values from -128 to 127

        byte c = 4;
        byte d = 5; 
        byte e = 10;
        int f = c * d / e; //automatic type promotion in expressions
        System.out.println(f); //output will be 2, as byte is promoted to int  
        
        int number = 'A';
        System.out.println(number); //ASCII value of 'A' is 65, so output will be 65

        System.out.println("नमस्कार");//printing in Hindi, Java supports Unicode characters
        
        //calculating result with mixed data types
        byte x = 10;
        char y = 'A';
        short z = 20;
        int i = 56;
        float j = 4.5f;
        double k = 3.14;
        double result = (j*x) + (i/z) - (k/y);
        //float + int - double = double (automatic type promotion)
        System.out.println(result); //calculating result with mixed data types
    }
}
