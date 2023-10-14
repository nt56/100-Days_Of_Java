public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {10,22,300,4,52};

        //sorting array in descending order
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i == 1){
                break;
            }
        }
        //displaying 2nd elements in an array
        System.out.println("Second Largest Element : " +arr[1]);
    }

}
