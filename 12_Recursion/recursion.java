
public class recursion {
    public static void main(String[] args) {
        //write a function to print numbers from 1 to 5
        print(1);
    }
    static void print(int n){
        //base condition
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive call
        //if you are calling a function again and again then it is called recursion
        //it takes a seperate memory stack
        print(n+1);//tail recursion
        //System.out.println(n);//this will print in reverse order
    }

}
//it helps in breaking a big problem into smaller problems
//it is used in tree and graph data structures
//it is used in sorting algorithms like quicksort and mergesort
//it is used in dynamic programming
//it is used in backtracking algorithms like n-queens problem, sudoku solver etc.
//you can convert recursion solution into intration and vice versa
//space complexity is not constant because of function call stack
//time complexity is O(n)