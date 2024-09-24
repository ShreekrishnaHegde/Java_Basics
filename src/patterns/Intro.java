package patterns;
/*
*
* *
* * *
* * * *

 */
public class Intro {
    public static void main(String[] args) {
        int n=4;
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

/*
-----------Approach---------
->Run the outer for loop" for "number of row times
->for every row identify how many columns are there , and how they are varying with row number
->type of elements in the column.

 */
