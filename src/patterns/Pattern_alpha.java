package patterns;

public class Pattern_alpha {
    public static void main(String[] args) {
        int n=6;
        pattern_1(n);
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
            System.out.println("");
        }

    }


}
