package access;

public class main {
    public static void main(String[] args) {
        A obj = new A(34,"krushna");
        //need to do a few things
        //1. access the data membber
        //2. modify the data member

        obj.setNum(45);
        System.out.println(obj.getNum());
    }
}
