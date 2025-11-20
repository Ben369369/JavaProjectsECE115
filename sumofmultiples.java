public class sumofmultiples {
    
    public static int sumOfMultiples3(int max){
        int sum=0;
        for(int i=0;i<max;i++){
            if(i%3==0||i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int max=1000;
        System.out.println(sumOfMultiples3(max));
    }
}
