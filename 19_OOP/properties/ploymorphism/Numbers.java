package properties.ploymorphism;

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    double sum(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        Numbers n = new Numbers();
        System.out.println(n.sum(10,20));
        System.out.println(n.sum(10,20,30));
        System.out.println(n.sum(10.5,20.5));
    }
}
