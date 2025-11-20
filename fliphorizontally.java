
    import external.Picture;
    public class fliphorizontally {
        public static void mirrorX(Picture sourceImg) {
            int width=sourceImg.width();
            int height=sourceImg.height();
            Picture target=new Picture(width,height);
            
            for(int i=0;i<width;i++){
                for(int j=0;j<height;j++){
                    target.set(i,height-j-1,sourceImg.get(i,j));

                }
            }
            target.show();
        }
        public static void main(String[] args) {
            Picture pic=new Picture("C:\\Users\\benon\\OneDrive\\Desktop\\ECE 115 Practice codes\\PU-Campus-1.jpg");
            mirrorX(pic);
        }
    

}
    