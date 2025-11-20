public class palindrome {
    /**This method generates a palindrome string based on the input integer.*/
    public static void main(String[] args) {
        int n=3;
        System.out.println(palindrome(n));
}
public static String palindrome(int i){
    if(i==0){
        return "x";
    }
    if(i==1){
        return "y";
    }
    return(palindrome(i-2)+palindrome(i-1)+palindrome(i-2));
}
}

