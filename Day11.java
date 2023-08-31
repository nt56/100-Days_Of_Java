import java.util.Scanner;

public class ReverseNumber {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Series Of Number : ");
        int num = sc.nextInt();
        int reverse = 0;
        int rem;

        while (num != 0){
            rem = num % 10;     //extracting last number from series storing in rem
            reverse = reverse * 10 + rem;  //reversing the number --> putting last number at starting
            num = num / 10;     //storing  remaining numbers expect extracted
        }
        System.out.println("Reverse : "+reverse);
    }

}
////for positive numbers
//num = 1234
//rem = 1234 % 10 --> 4
//reverse = 0 * 10 + 4 --> 4
//num = 1234/10 --> 123
//so on until num = 0





import java.util.Scanner;

public class ReverseNumber {

   static void getReverse(int num){
       if (num == 0)
           return;

       int rem = num % 10;
       System.out.print(rem);

       getReverse(num/10);
   }

   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Series Of Number : ");
       int num = sc.nextInt();
       boolean isNegative = num < 0 ? true : false;

       if(isNegative){
           System.out.print("-");
           num = num * -1;
       }

       getReverse(num);
   }

}
//for negative numbers using recursion
