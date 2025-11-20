public class checkIfPrime {
    //method to check if a number in an array is prime or not using trial division algorithim
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; // no divisors found, is prime
    }
    //method to check the entire array and print results
    public static void checkArrayForPrimes(int[] numbers) {
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number + " is prime.");
            } else {
                System.out.println(number + " is not prime.");
            }
        }
    }
    //method to print prime numbers betweentwo given numbers both included
    public static void printPrimesInRange(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); 
    }
    //main method to test the functionality
    public static void main(String[] args) {
        int[] testArray = {1,2,3,13,14,20,37,89,1236,2340};
        checkArrayForPrimes(testArray);
        printPrimesInRange(10, 50);
    }
}
