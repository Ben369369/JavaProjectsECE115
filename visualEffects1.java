import external.Picture;
public class visualEffects1 {
    public static void visualEffectX(Picture sourceImg){
        int width=sourceImg.width();
        int height=sourceImg.height();
        Picture target=new Picture(width,height);


        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                if(j<height/2){
                    target.set(i,j,sourceImg.get(i,j));
                }
                else{
                    target.set(i,j,sourceImg.get(i,height-j-1));
                }
            }
        }target.show();
    }
    public static void main(String[] args) {
        Picture pic=new Picture("C:\\Users\\benon\\OneDrive\\Desktop\\ECE 115 Practice codes\\PU-Campus-1.jpg");
        visualEffectX(pic);
    }
}
