import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.populate(scanner);
        binaryTree.display();
        binaryTree.prettyDisplay();
    }
}
