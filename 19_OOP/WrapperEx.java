public class WrapperEx {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        Integer num = 45; //boxing or wrapping

        Integer a = 10; //boxing or wrapping
        Integer b = 20; //boxing or wrapping

        swap(a,b);
        System.out.println(a + " " + b);

        final A obj = new A("krushna");
        obj.name = "new name";

        //when a no primitive is final , you connot change its value
        //obj = new A("new object");

        A obj2;
        // for(int i=0;i<1000000000;i++){
        //     obj2 = new A("new object");
        // }
    }
   static  void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}
class A{
    final int sum = 10;
    String name;
    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}