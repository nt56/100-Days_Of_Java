public class MinMaxElement {
    public static void main(String[] args) {
        int[] arr = {11,5,99,666,562,2};

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i< arr.length; i++){

            if(max < arr[i]){
                max = arr[i];
            }

            if(min > arr[i]){
                min = arr[i];
            }

        }

        System.out.print("Max : "+max);
        System.out.println();
        System.out.print("Min : "+min);

    }
}
