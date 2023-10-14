import java.util.Scanner;

public class GreatestOfThreeNumbers {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Num1 : ");
       int n1 = sc.nextInt();
       System.out.print("Enter Num2 : ");
       int n2 = sc.nextInt();
       System.out.print("Enter Num2 : ");
       int n3 = sc.nextInt();

       if(n1==0 && n2==0 && n3==0){
           System.out.println("Enter Correct Input");
       } else if (n1>=n2 && n1>=n3) {
           System.out.println(n1+ " is Greater");
       } else if (n2>=n1 && n2>=n3) {
           System.out.println(n2+ " is Greater");
       } else {
           System.out.println(n3+ " is Greater");
       }

   }

}
////method-1


import java.util.Scanner;

public class GreatestOfThreeNumbers {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Num1 : ");
       int n1 = sc.nextInt();
       System.out.print("Enter Num2 : ");
       int n2 = sc.nextInt();
       System.out.print("Enter Num2 : ");
       int n3 = sc.nextInt();

       int temp,result;

       // find the largest b/w num1 and num2 & store in temp
       temp = n1>n2 ? n1 : n2;

       // find the largest b/w temp and num3 & finally printing it
       result = temp>n3 ? temp : n3;

       System.out.println(result+ " is the greatest");

   }

}
////method-2


import java.util.Scanner;

public class GreatestOfThreeNumbers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Num2 : ");
        int n2 = sc.nextInt();
        System.out.print("Enter Num2 : ");
        int n3 = sc.nextInt();

        int temp,result;

        // find the largest b/w num1 and num2 & store in temp
        temp = Math.max(n1, n2);

        // find the largest b/w temp and num3 & finally printing it
        result = Math.max(temp, n3);

        System.out.println(result+ " is the greatest");

    }

}
//method-3
