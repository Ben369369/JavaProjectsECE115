public class Functions {
    public static void PrintValues(int v){
        System.out.println("The question is worth "+v+" points.");
    
    }
    public static void printValues(double v){
        System.out.println("My score will be "+v+" points.");
    }
    public static void printValues(int x,double y){
        System.out.print("I will get " + x+"of ");
        System.out.println(y+" points on this question.");
    }
    public static void printValues(double x , int y ){
        System.out.print("Of all the"+x+" points, ");
        System.out.println("I will get "+y+" points.");}
    
    public static void main(String[] args){
    int i=10;
    double d=9.5;

  printValues(d);
  printValues(i);
  printValues(d,i);
    
}
    
}
