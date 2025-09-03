package pattern;

public class pattern {
    public static void main(String[] args) {
        
       // pattern1(4);
       // pattern2(4);
        //pattern3(4);
        //pattern4(4);
        //pattern5(5);
        //pattern28(5);
        //pattern30(5);
        pattern31(4);
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            //for every row, run the col
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            //for every row, run the col
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row=1;row<=n;row++){

            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row=1;row<=n;row++){

            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        // for (int row=1;row<=n;row++){

        //     for(int col=1;col<=row;col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int row=2;row<=n;row++){

        //     for(int col=1;col<=n+1-row;col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for (int row=0;row<=2*n;row++){
            int TotalColcInRow=row > n  ? 2 * n-row : row;
            for(int col=0;col<TotalColcInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row=0;row<=2*n;row++){
            int TotalColcInRow=row > n  ? 2 * n-row : row;

            int spaces=n-TotalColcInRow;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<TotalColcInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     static void pattern30(int n){
        for (int row=1;row<=n;row++){

            int spaces=n-row;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        int orignalN=n;
        n=2*n;
        for (int row=0;row<=n;row++){

            for(int col=0;col<=n;col++){
                int atEveryIndex =orignalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
                
                
            }
            System.out.println();
        }
    }


    
}
 