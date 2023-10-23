public class RemovingBrackets {
    public static void main(String[] args) {
        String s = "{(a+b)*c(d-a)]}";
        String result = s.replaceAll("[](){}]","");
        System.out.println("Expression without brackets : "+result);
    }
}
