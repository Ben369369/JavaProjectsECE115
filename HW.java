
public class HW {
    
    public static int groucho(int i) {
        int j = i + 3;
        return j;
    }

    public static void chico(int[] b, int j) {
        int i = j + 1;
        b[groucho(i)] = b[j];
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 5, 8, 13};
        int i = 1;
        
        chico(a, i);

        System.out.println("Groucho says " + groucho(i));
        System.out.println("Harpo says " + a[groucho(i)]);
        System.out.println("Zeppo says " + a[groucho(i + 1)]);
    }
}

