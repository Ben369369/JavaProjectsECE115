public class Homer{
    public static void Bart(int[]a){
        for(int i=0;i<a.length;i++){
            //compute new position
            int newpos=(int)(Math.random()*a.length);
            //how the swapping works: swap a[i] and a[newpos]  mn 
            int temp=a[newpos];
            a[newpos]=a[i];
            a[i]=temp;
           
        }
    }
    public static void main(String[] args){
        int[] x={1,2,3,4,5,6};
        Bart(x);
        for(int j=0;j<x.length;j++)
            System.out.print(x[j]+" ");
        
    }
    
}//the errors are fo