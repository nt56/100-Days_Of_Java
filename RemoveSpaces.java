import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "  Nag Bhu shan Ti rth ";
        char[] c = s.toCharArray();

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<c.length-1; i++){
            if ( (c[i] != ' ') && (c[i] != '\t')){
                sb.append(c[i]);
            }
        }
        System.out.println("String after removing spaces : "+sb);
    }
}
