package interfaces;

public class CDPlayer implements Media {
    
    @Override
    public void start(){
        System.out.println("CD Player started playing.");
    }
    
    @Override
    public void stop(){
        System.out.println("CD Player stopped playing.");
    }
}
