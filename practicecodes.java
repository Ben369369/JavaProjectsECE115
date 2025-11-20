public class practicecodes {
    public static int[] getEvenNumbers(int[]numbers){//method to get even numbers from an array
        int[]evenNumbers=new int[numbers.length];
        int evenNumbersCount=0;
        for(int number:numbers){
            if(number%2==0){
                evenNumbers[evenNumbersCount] = number;
                evenNumbersCount++;
            }
        }return evenNumbers; }
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i =0;i<numbers.length;i++){
            numbers[i]=i+1;
        }
        int evenNumbersCount =0;
        for(int number:numbers){
            if(number%2==0){
                evenNumbersCount+=3;
            }
        }System.out.println("The number of even numbers is :"+evenNumbersCount);
        //add comments to the code
        int[] nos = new int[10];
        for(int i =0;i<nos.length;i++){
            nos[i]=i+2;
        }
        int count=0;
        for(int number:nos){
            count++;//increment count for each number
            if(number/2==3){
                continue;//skip the number if it is 6o
            }
        }
        System.out.println("The count is :"+count);//print the count


        int[] nambari ={1,2,3,4,5,6,7,8,9,10};
        int[]evenNumbers=getEvenNumbers(nambari);
        for(int evenNumber:evenNumbers){
            System.out.println(evenNumber+" ");
        }
    }
}
