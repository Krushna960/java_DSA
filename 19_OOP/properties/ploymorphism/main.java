package properties.ploymorphism;

public class main {
    public static void main(String[] args) {
        shapes obj;
        obj = new circle();
        obj.area();

        obj = new square();
        obj.area();

        obj = new triangle();
        obj.area();
    }
}
