public class AscendingDscendingOrder {

    //method for sorting
    static void printOrder(int[] arr, int n){

        //traversing a whole array
        for(int i=0; i<n-1; i++){

            //for ascending order
            for(int j=0; j<n/2; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            //for descending order
            for(int j=n/2; j<n-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }

    }

    //main method
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
        int n = arr.length;
        printOrder(arr, n);
    }

}
