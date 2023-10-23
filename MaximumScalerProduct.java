public class MaximumScalerProduct {
    public static void main(String[] args) {

        int[] arr1 = {10,85,96,4,2,56};
        int[] arr2 = {33,88,55,99,1,3};
        int len = arr1.length;

        //sort arr1 in ascending order
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(arr1[i] > arr1[j]){
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        //sort arr2 in descending order
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(arr2[i] < arr2[j]){
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        //calculating the product
        int product = 0;
        for(int i=0; i<len; i++){
            product = product + arr1[i] * arr2[1];
        }
        System.out.println(product);

    }
}
