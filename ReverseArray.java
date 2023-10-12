////method-1
public class ReverseArray {
   public static void main(String[] args) {
       int[] arr = {10,20,30,40,50};
       for(int i=arr.length-1; i>=0; i--){
           System.out.print(arr[i] +" ");
       }
   }
}

//method-2 --> Swapping
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
