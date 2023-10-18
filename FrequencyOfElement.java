import java.util.Arrays;

public class FrequencyOfElement {

    static void countFrequency(int[] arr, int n){

        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);

        //traverse through array and count frequency
        for(int i=0; i<n; i++){

            // Skip this element if already processed
            if(visited[i])
                continue;

            //count frequency
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] +" Occurs " +count+ " times ");
        }
    }

    public static void main(String[] args) {

        int arr[] = new int[]{10, 30, 10, 20, 10, 20, 30, 10};
        int n = arr.length;
        countFrequency(arr,n);

    }

}
