package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(28);
        daughter.partner();

        // parent mom = new parent(); \
        // you connot create object of abstract class

        parent.greet(); // static method can be called using class name
        
        son.NormalMethod(); // normal method can be called using object of child class

    }
}
