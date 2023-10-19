import java.util.Scanner;

public class CalculateVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.next();

        int vowel = 0;
        char[] c = name.toCharArray();

        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
                vowel ++;
            }
        }
        System.out.print("Vowels : "+vowel);
    }
}
