package demos;

import external.Picture;

public class ImageModify {
	public static void main (String[] args) {
		
		Picture sourceImg = new Picture ("C:\\Users\\hosse\\Downloads\\myPic.jpg");
		int width = sourceImg.width();
		int height = sourceImg.height();
		
		double scaleX = 0.6;
		double scaleY = 1.2;
		
		int newWidth = (int)(scaleX*width);
		int newHeight = (int) (scaleY*height);
		
		Picture targetImg = new Picture(newWidth,newHeight);

		for(int i = 0; i < newWidth; i++) {
			for (int j = 0; j < newHeight; j++) {
				targetImg.set(i, j, sourceImg.get((int)(i/scaleX),(int)(j/scaleY)));
			}
		}
		sourceImg.show();
		targetImg.show();
	}
}




