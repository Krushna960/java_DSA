package abstractDemo;

public abstract class parent {

    int age;

    public parent(int age) {
        this.age = age;
    }

    static void greet(){
        System.out.println("Hello everyone");
    }

    void NormalMethod(){
        System.out.println("This is a normal method in abstract class");
    }
    
    abstract void career();
    abstract void partner();
}
