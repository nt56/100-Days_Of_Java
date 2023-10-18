import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char c = sc.next().charAt(0);

        if(isLowerVowel(c) || isUpperVowel(c)){
            System.out.println(c+ " is Vowel");
        }
        else {
            System.out.println(c+ " is Consonant");
        }

    }

    static boolean isLowerVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    static boolean isUpperVowel(char c){
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

}
