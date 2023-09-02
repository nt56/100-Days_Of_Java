import java.util.Scanner;

public class ArmstrongNumber {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int num,rem,arm=0,temp;
       System.out.print("Enter Number : ");
       num = sc.nextInt();
       temp = num;

       while(temp != 0){
           rem = temp % 10;
           arm = (rem*rem*rem) + arm;
           temp = temp / 10;
       }

       if (num == arm){
           System.out.println(num+" is armstrong");
       } else {
           System.out.println(num+" is not a armstrong");
       }

   }

}

//method-2
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num,rem,arm=0,temp,digits;
        System.out.print("Enter Number of digits : ");
        digits = sc.nextInt();
        System.out.print("Enter Number : ");
        num = sc.nextInt();
        temp = num;

        while(temp != 0){
            rem = temp % 10;
            arm = (int)Math.pow(rem, digits) + arm;
            temp = temp / 10;
        }

        if (num == arm){
            System.out.println(num+" is armstrong");
        } else {
            System.out.println(num+" is not a armstrong");
        }

    }

}

