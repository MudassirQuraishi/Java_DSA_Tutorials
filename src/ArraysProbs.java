import java.util.Scanner;

public class ArraysProbs {


    public static void main(String[] args) {
        //Given size add elements from 1-length in array;
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the length: ");
        int length = sc.nextInt();

        //Storing the array returned from then function to this array
        int [] returnedArray = addElements(length);


        for(int i = 0; i < length; i++){
            System.out.print(returnedArray[i]+ " ");
        }

        System.out.print( "Enter the length-2: ");
    }
    //(Access Modifier) (Static) (Return Type) (function Custom Name)((Params))
    private static int [] addElements(int length){
        //Initialising array with given length
        int [] newArray = new int[length];
        for(int i = 0; i < length; i++){
            // newArray[i] -> Element at ith index
            newArray[i] = i+1 ;
        }
        //Return
        return newArray;
    }
}
