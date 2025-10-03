package staticExample;

public class main {
    public static void main(String[] args) {
        // Human kunal = new Human(22,"kunal",10000,false);
        // Human rahul = new Human(21,"rahul",15000,true);

        // System.out.println(kunal.population);
        // System.out.println(rahul.population);

        //greeting(); //give error
    }

    //this is not dependent on bojects
    static void fun(){
        //greeting(); //you  cannot use this because it requires an instance
        // but the fun you are using it in does not depend on instance

        main obj = new main();
        obj.greeting();
    }

    //we know that something which is not static, belongs to an object 
    void greeting(){
        // fun();
        System.out.println("hello world");
    }
}
 