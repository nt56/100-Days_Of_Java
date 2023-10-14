import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int result=0;

        for(int i=1; i<num; i++){
            if(num % i == 0){
                result = result + i;
            }
        }

        if(result > num){
            System.out.println(num+ " is abundant number");
            System.out.println("The abundant is : " +(result-num));
        } else {
            System.out.println(num+ " is not abundant number");
        }

    }

}

// For any number to be an Abundant Number, the sum of its factors except itself must be greater than the number
