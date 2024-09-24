package patterns;

public class Pattern_beta {
    public static void main(String[] args) {
        int n=5;
        diamond(n);
        pyramid(n);
        square(n);
    }

    static void diamond(int n){
        /*
         */
        for (int row = 0; row <2*n ; row++) {
            int totalcol=row>n?2*n-row:row;
            int space=n-totalcol;
            for (int s=0; s<space;s++)
                System.out.print(" ");
            for (int col = 0; col < totalcol; col++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();
    }

    static void pyramid(int n){
        for (int row = 1; row <= n ; row++) {
            /*
                1
               212
              32123
             4321234
            543212345
             */
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
    }
    static void square(int n){
        for (int row = 0; row <= 2*n; row++) {
            for (int col = 0; col <= 2*n; col++) {
                int indexvalue=n-Math.min(Math.min(row,col),Math.min(2*n-row,2*n-col));
                System.out.print(indexvalue+" ");
            }
            System.out.println();
        }
    }
}
