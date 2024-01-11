import java.util.Scanner;

public class forLoop {
    // for loop, while loop---- enhanced for loop, do while
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter element : ");
            arr[i] = sc.nextInt();
        }
        // arr = [0,1,2,3]
        //Iteration using for loop
        //for-loop structure
        //for( (initializer); (condition); (increment or decrement)){
        //
        //}
        int n = arr.length;
        //best time - if we search anything in the array we assume that the element is placed is in the first index O(1);
        //
        //*** worst time complexity - the element being searched is placed in the last index value O(n)
        for(int i = 0; i < n; i++ ){
            if(arr[i] == 1){
                System.out.println(i);
                break;
            }
        }
        /*
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        // int element is each element in arr;
        for(int element : arr){
            System.out.println(element);
        }
        */
    }
}
