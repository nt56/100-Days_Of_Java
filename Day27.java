import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number-1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number-2 : ");
        int num2 = sc.nextInt();
        int HCF = 0;

        for(int i=1; i<=num1 || i<=num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                HCF = i;
            }
        }
        System.out.println("HCF : " +HCF);
    }

}
//The highest common factor (HCF) or greatest common factor is the largest integer that two or more numbers can be divided by. 
