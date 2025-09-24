import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        //pad("", "23");
        System.out.println(padret("", "23"));
    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        int digit = ch - '0'; // convert char to int

        for(int i=(digit-1)*3; i<digit*3; i++){
            char padChar = (char) ('a' + i);
            pad(p + padChar, up.substring(1));
        }


    }
    static ArrayList<String> padret(String p, String up){
         if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        char ch = up.charAt(0);
        int digit = ch - '0'; // convert char to int

        ArrayList<String> list = new ArrayList<>();

        for(int i=(digit-1)*3; i<digit*3; i++){
            char padChar = (char) ('a' + i);
            list.addAll(padret(p + padChar, up.substring(1)));
        }

        return list;
    }
}
