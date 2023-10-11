//method-1
public class MinArrayElement {
    public static void main(String[] args) {
        int[] arr = {11,5,99,666,562,2};
        int min = arr[0];

        for(int i=0; i< arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.print("Min Ele: " +min);
    }
}

//method-2 also in given ranges
import java.util.Arrays;

public class MinArrayElement {

   public static void main(String[] args) {

       int[] arr = {11,55,6,8,90,4,8};
       System.out.println(Arrays.toString(arr));

       System.out.println(min(arr));

       System.out.println(minRange(arr,1,3));
   }

   //traversing to the whole array
   static int min(int[] arr){
       int minEle = arr[0];
       for(int i=1; i<arr.length; i++){
           if(minEle > arr[i]){
               minEle = arr[i];
           }
       }
       return minEle;
   }

   //traversing to the whole array
   static int minRange(int[] arr, int start, int end){
       int minEle = arr[0];
       for(int i=start; i<=end; i++){
           if(minEle > arr[i]){
               minEle = arr[i];
           }
       }
       return minEle;
   }
}
