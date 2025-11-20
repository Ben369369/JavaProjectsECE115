
    import external.Picture;
    public class flipvertically {
        public static void mirrorY(Picture sourceImg) {
            int width=sourceImg.width();
            int height=sourceImg.height();
            Picture target=new Picture(width,height);
            
            for(int i=0;i<width;i++){
                for(int j=0;j<height;j++){
                    target.set(width-i-1,j,sourceImg.get(i,j));

                }
            }
            target.show();
        }
        public static void main(String[] args) {
            Picture pic=new Picture("C:\\Users\\benon\\OneDrive\\Desktop\\ECE 115 Practice codes\\PU-Campus-1.jpg");
            mirrorY(pic);
        }
    

}
    