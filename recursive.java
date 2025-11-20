public class recursive {
    public static int Ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return Ack(m-1,1);
        } else {
            return Ack(m-1,Ack(m,n-1)); // Indicate that m is too large
        }
    }
    public static void main(String[] args) {
        System.out.println(Ack(0,0));
        System.out.println(Ack(1,3));//it works by 
        System.out.println(Ack(2,3));
    }
}
