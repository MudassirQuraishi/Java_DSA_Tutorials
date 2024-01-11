public class whileLoop {
    public static void main(String[] args) {
        //whole-loop ... do-while
        //while loop structure
        // (initialization)
        //while((condition)){
        //      (incre / decre);
        //}
        int  [] arr ={5,4,3,2,1};
        int i = 0;
        /*
        while(arr[i] != 1){
            System.out.println(arr[i]);
            i++;
        }
        */
        do{
            System.out.println(arr[i]);
            i++;
        } while( i < 0);
    }
}
