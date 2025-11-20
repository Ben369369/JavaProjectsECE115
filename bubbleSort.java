public class bubbleSort {
    //static method that implements bubble sort of a double array
    public static void Sort(double[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
    //main method to test the bubble sort method
    public static void main(String[] args) {    
        double[] testArray = {3.2,2.0,1.2,0.9,10.8,0.2};
        System.out.println("Original array:");
        for (double num : testArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        Sort(testArray);

        System.out.println("Sorted array:");
        for (double num : testArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
