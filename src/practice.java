public class practice {
     private static void swap (int a, int b) {
         int temp = a;
         a = b;
         b = temp;
         System.out.println(a);
         System.out.println(b);
     }
     public static int largestAmong2(int a, int b ){
         return Math.max(a,b);
     }
    public static int largestAmong3(int a, int b , int c){
        if( a > b && a > c){
            return a;
        }
        else if( b > a &&  b > c){
            return b;
        }
        return c;
    }
static  int value= 10;
    public static void main(String[] args) {
        /*swapping of variables
        int a = 10;
        int b = 20;
        //int c = 50;
        //swap(a, b);
        //int result = largestAmong3(a, b,c);
        //System.out.println(result);

        // int result = (condition) ? (true) : (false);
        int result = a > b ? a : b;
        System.out.println(result)
        );
        */
        int a = 10;
        int b = 20;
        int result = max(a,b);
     }
     //(accessModifier) (static) (return type) (function name)((params)) - function structure
     public static int  max (int a, int b ){
        return a > b ? a : b;
     }
}
