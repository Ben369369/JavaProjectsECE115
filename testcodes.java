public class testcodes {
    public static void main(String[] args) {

        
     int n=1;
    String result="";
    do{
        if(n%4==1){
            result+=" X";
        }
        else{
            result+=n;
        }n+=3;
        }while(n<12);
    System.out.println(result);
    }}
