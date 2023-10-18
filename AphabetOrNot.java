import java.util.Scanner;

public class AphabetOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char c = sc.next().charAt(0);

        //normal
//        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
//            System.out.println(c +" is Alphabet");
//        }
//        else {
//            System.out.println(c +" Not a Alphabet");
//        }

        //Using Ascii value
        if( (c >= 97 && c <= 122) || (c >= 65 && c <= 90)){
            System.out.println(c +" is Alphabet");
        }
        else {
            System.out.println(c +" Not a Alphabet");
        }

    }

}
