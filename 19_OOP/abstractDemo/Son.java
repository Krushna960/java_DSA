package abstractDemo;

public class Son extends parent {

    public Son(int age) {
        super(age);
    }
    
    @Override
    void career(){
        System.out.println("My career is engineer" );
    }
    @Override
    void partner(){
        System.out.println("My partner name is ishwari" );
    }
}
