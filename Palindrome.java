import java.util.Scanner;

public class Palindrome {

   public static void main (String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Number : ");
       int num = sc.nextInt();
       int reverse = 0;
       int rem;
       int temp;

       temp = num;

       while (temp != 0){
           rem = temp % 10;     //extracting last number from series storing in rem
           reverse = reverse * 10 + rem;  //reversing the number --> putting last number at starting
           temp = temp / 10;     //storing  remaining numbers expect extracted
       }
       if (num == reverse){
           System.out.println(num+ " is Palindrome");
       }
       else {
           System.out.println(num+ " is not Palindrome");
       }
   }

}
//method-1 (common)


import java.util.Scanner;

public class Palindrome {

    static int getReverse(int num, int rev){
        if (num == 0)
            return rev;

        int rem = num % 10;
        rev = rev * 10 + rem;

        return getReverse(num/10, rev);
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int reverse = 0;
        int rem;
        int temp;

        if (getReverse(num, reverse) == num){
            System.out.println(num+ " is Palindrome");
        }
        else {
            System.out.println(num+ " is not Palindrome");
        }
    }

}
//method-1 --> recursion
