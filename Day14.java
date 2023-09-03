//import java.util.Scanner;
//
//public class RangeArmstrongNumber {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Lower Bound Number : ");
//        int lower = sc.nextInt();
//        System.out.print("Enter Upper Bound Number : ");
//        int upper = sc.nextInt();
//
//        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are : ");
//
//        for (int i = lower; i <= upper; i++) {
//
//            int rem, arm = 0, temp;
//            int len = digits(i); // Calculate the number of digits for 'i' instead of 'lower'
//            temp = i;
//
//            // logic for armstrong
//            while (temp != 0) {
//                rem = temp % 10;
//                arm = (int) (Math.pow(rem, len) + arm);
//                temp = temp / 10;
//            }
//
//            // printing the armstrong number
//            if (i == arm)
//                System.out.println(i);
//        }
//    }
//
//    // function for calculating the length of number
//    static int digits(int num) {
//        int len = 0;
//        while (num != 0) {
//            len++;
//            num = num / 10;
//        }
//        return len;
//    }
//}
//above code running successfully but not showing the code


import java.util.Scanner;

public class RangeArmstrongNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower and upper ranges : ");
        int low = sc.nextInt();
        int high = sc.nextInt();

        System.out.println("Armstrong numbers between "+ low + " and " + high + " are : ");

        // loop for finding and printing all armstrong numbers between given range
        for(int num = low ; num <= high ; num++)
        {
            int sum = 0, temp, digit, len;

            len = getOrder(num);
            temp = num;
            // loop to extract digit, find ordered power of digits & add to sum
            while(temp != 0)
            {
                // extract digit
                digit = temp % 10;

                // add power to sum
                sum = sum + (int) Math.pow(digit,len);
                temp /= 10;
            };

            if(sum == num)
                System.out.print(num + " ");
        }

    }

    private static int getOrder(int num) {
        int len = 0;
        while (num!=0)
        {
            len++;
            num = num/10;
        }
        return len;
    }

}
