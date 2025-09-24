
import java.util.ArrayList;

public class SunSeq {
    public static void main(String[] args) {
        //subseq("", "abc");
        //System.out.println(subseqRet("", "abc"));
        System.out.println(subseqAscii("", "ab"));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
    static ArrayList<String> subseqAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        int code = ch;

        ArrayList<String> first = subseqAscii(p + ch, up.substring(1));
        ArrayList<String> second = subseqAscii(p, up.substring(1));
        ArrayList<String> third = subseqAscii(p + code, up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
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
