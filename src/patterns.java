public class patterns {
    public static void main(String[] args) {
        /*
         1 2 3 4 5
       1 * - - - -
       2 * * - - -
       3 * * * - -
       4 * * * * -
       5 * * * * *

        int n = 5;
        // outer loop. Number of rows
        for(int i = 1; i <= 5; i++){
            //Inner loop . Number of columns
            for(int j = 5; j >= i; j--){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        */

                /*
         5 4 3 2 1
       1 - - - - *
       2 - - - * *
       3 - - * * *
       4 - * * * *
       5 * * * * *
         */
        int n = 5;
        //Outer Loop
        for(int i = 1; i <= n; i++){
            //Spaces Loop
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            //Star Printing
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
