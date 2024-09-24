package patterns;

public class Pattern_alpha {
    public static void main(String[] args) {
        int n=6;
        pattern_1(n);
        pattern_2(n);
        pattern_3(n);
        pattern_4(n);
        pattern_5(n);
    }

    static void pattern_1(int n){
        /*
        *
        * *
        * * *
        * * * *
         */
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();

    }

    static void pattern_2(int n){
        /*
        * * * *
        * * * *
        * * * *
         */
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern_3(int n){
        /*
        * * * *
        * * *
        * *
        *
         */
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }

    static void pattern_4(int n)
    {
        /*
        1
        1 2
        1 2 3
         */
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();

        }
        System.out.println();
    }

    static void pattern_5(int n){
        /*
        *
        * *
        * * *
        * *
        *
         */
        for (int row = 1; row <=2*n-1; row++) {
            int totalCol=row > n ? 2*n-row : row;
            for (int col = 1; col <=totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
    }

}
