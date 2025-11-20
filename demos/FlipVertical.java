package demos;

import external.Picture;

public class FlipVertical {
	
	public static void main (String[] args) {
		
		Picture source = new Picture ("C:\\Users\\hosse\\Downloads\\myPic.jpg");
		int width = source.width();
		int height = source.height();
		Picture target = new Picture(width, height);
		
		for(int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				target.set(width - i -1, j, source.get(i, j));
			}
		}
		source.show();
		target.show();
	}
}






