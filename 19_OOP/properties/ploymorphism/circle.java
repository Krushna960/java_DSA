package properties.ploymorphism;

public class circle extends shapes{
    //this will override the area method of shapes class
    @Override //this annotation is optional
    void area(){
        System.out.println("Area of circle is πr²");
    }
}
