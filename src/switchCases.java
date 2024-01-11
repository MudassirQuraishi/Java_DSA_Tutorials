import java.util.Scanner;

public class switchCases {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        /*
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                System.out.println("Monday");
            }
            else if( arr[i] == 2){
                System.out.println("Tuesday");
            }
            else if( arr[i] == 3){
                System.out.println("Wednesday");
            }
            else if( arr[i] == 4){
                System.out.println("Thursday");
            }
            else if( arr[i] == 5){
                System.out.println("Friday");
            }
            else if( arr[i] == 6){
                System.out.println("Saturday");
            }
            else if( arr[i] == 7){
                System.out.println("Sunday");
            }
        }
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int dayNumber = sc.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("None");
        }
    }
}
