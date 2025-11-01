package abstractDemo;

public class Daughter extends parent {

    public Daughter(int age) {
        super(age);
    }

     @Override
    void career(){
        System.out.println("My career is doctor ");
    }
    @Override
    void partner(){
        System.out.println("My partner name is john");
    }
    
}
