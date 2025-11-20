import external.Picture;
public class visualEffects2 {
    public static void visualEffectY(Picture sourceImg){
        int width=sourceImg.width();
        int height=sourceImg.height();
        Picture target = new Picture(width,height);
        
        for(int j=0;j<width;j++){
            for(int i=0;i<height;i++){
                if(j<width/2){

                    target.set(j,i,sourceImg.get(j,i));
                }
                else{
                   
                    int mirrorJ = width - j - 1;
                    target.set(j,i,sourceImg.get(mirrorJ,i));
                }
            }
        }
        target.show();
    }
    public static void main(String[] args) {
        Picture pic=new Picture("C:\\Users\\benon\\OneDrive\\Desktop\\ECE 115 Practice codes\\PU-Campus-1.jpg");
        visualEffectY(pic);
    }
}
