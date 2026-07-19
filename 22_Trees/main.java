import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTree binaryTree = new BinaryTree();
        // binaryTree.populate(scanner);
        // binaryTree.display();
        // binaryTree.prettyDisplay();

        // BST bst = new BST();
        // int[] nums = { 10, 5, 15, 3, 7, 12, 18 };
        // bst.populate(nums);
        // bst.display();
        // System.out.println("Is the BST balanced? " + bst.balanced());

        // int[] sortedNums = { 1, 2, 3, 4, 5, 6, 7 };
        // bst.populateSorted(sortedNums);
        // bst.display();

        AVL avl = new AVL();
        for (int i = 1; i < 10; i++) {
            avl.insert(i);
        }

        avl.display();
        System.out.println("Is the AVL tree balanced? " + avl.balanced());}
}
