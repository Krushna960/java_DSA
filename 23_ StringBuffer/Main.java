import java.util.Arrays;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // default capacity is 16

        // constructor 2
        StringBuffer sb2 = new StringBuffer("krushna patil");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity()); // capacity is 30

        sb.append("hello");
        sb.append(" world");

        System.out.println(sb); // prints "hello world"

        sb.replace(1, 5, "Java");
        System.out.println(sb); // prints "hJava world"

        //sb.reverse();

        String str = sb.toString();
        System.out.println(str); // prints "hJava world"

        //remove all the white spaces from the string
        String sentence = "I am learning Java";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", "")); // prints "IamlearningJava"

        // split the string into words
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); // prints "[I, am, learning, Java]"

        //rounding off 
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(3.7)); // prints "03.7000"

        // generate a random string
        int size = 10;
        String randomString = RandomString.generate(size);
        System.out.println(randomString); // prints a random string of length 10    

    }
}
