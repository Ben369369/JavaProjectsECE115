

import java.awt.Color;
import java.util.Scanner;

import external.Picture;
public class imageProcessor{




	
	// 1
	public static void showRed(Picture sourceImg) {
		
		int width = sourceImg.width();
		int height = sourceImg.height();
		Picture targetImg = new Picture(width, height);
		
		int red;
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				
				red = sourceImg.get(i, j).getRed();
				
				targetImg.set(i, j, new Color(red, 0, 0));
				
			}
		}
		
		targetImg.show();
	}
	
	// 2
	public static void showGreen(Picture sourceImg) {
		
		int width = sourceImg.width();
		int height = sourceImg.height();
		Picture targetImg = new Picture(width, height);
		
		int green;
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				
				green = sourceImg.get(i, j).getGreen();
				
				targetImg.set(i, j, new Color(0, green, 0));
				
			}
		}
		
		targetImg.show();
	}
	
	// 3
	public static void showBlue(Picture sourceImg) {
		
		int width = sourceImg.width();
		int height = sourceImg.height();
		Picture targetImg = new Picture(width, height);
		
		int blue;
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				
				blue = sourceImg.get(i, j).getBlue();
				
				targetImg.set(i, j, new Color(0, 0, blue));
				
			}
		}
		
		targetImg.show();
	}
	// 4 - make picture bright
	
   public static void makeBrighter(Picture sourceImg, int k) {
       int width = sourceImg.width();
       int height = sourceImg.height();
       Picture targetImg = new Picture(width, height);
       for (int i = 0; i < width; i++) {
           for (int j = 0; j < height; j++) {
               Color c = sourceImg.get(i, j);
               int r = clamp(c.getRed() + k);
               int g = clamp(c.getGreen() + k);
               int b = clamp(c.getBlue() + k);
               targetImg.set(i, j, new Color(r, g, b));
           }
       }
       targetImg.show();
   }
   private static int clamp(int value) {
       if (value < 0) return 0;
       if (value > 255) return 255;
       return value;
   }
  
   // 5 - make image darker
   public static void makeDarker(Picture sourceImg, int k) {
       int width = sourceImg.width();
       int height = sourceImg.height();
       Picture targetImg = new Picture(width, height);
       for (int i = 0; i < width; i++) {
           for (int j = 0; j < height; j++) {
               Color c = sourceImg.get(i, j);
               int r = clamp(c.getRed() - k);
               int g = clamp(c.getGreen() - k);
               int b = clamp(c.getBlue() - k);
               targetImg.set(i, j, new Color(r, g, b));
           }
       }
       targetImg.show();
   }
	
	// 6 - rotate image
	public static void rotate(Picture sourceImg, int theta) {
		
		int red;
		int green;
		int blue;
		
		int sourceWidth = sourceImg.width();
		int sourceHeight = sourceImg.height();
		
		Picture targetImg;
		
		switch (theta) {
		case 270:
			targetImg = new Picture(sourceHeight, sourceWidth);
			
			for (int i = 0; i < sourceWidth; i++) {
				for (int j = 0; j < sourceHeight; j++) {
					
					red = sourceImg.get(i, j).getRed();
					green = sourceImg.get(i, j).getGreen();
					blue = sourceImg.get(i, j).getBlue();
					
					targetImg.set(sourceHeight - j - 1, i, new Color(red, green, blue));
					
				}
			}
			
			targetImg.show();
			break;
			
		case 180:
			targetImg = new Picture(sourceWidth, sourceHeight);
			
			for (int i = 0; i < sourceWidth; i++) {
				for (int j = 0; j < sourceHeight; j++) {
					
					red = sourceImg.get(i, j).getRed();
					green = sourceImg.get(i, j).getGreen();
					blue = sourceImg.get(i, j).getBlue();
					
					targetImg.set(sourceWidth - i - 1, sourceHeight - j - 1, new Color(red, green, blue));
					
				}
			}
			
			targetImg.show();	
			break;
			
		case 90:
			targetImg = new Picture(sourceHeight, sourceWidth);
			
			for (int i = 0; i < sourceWidth; i++) {
				for (int j = 0; j < sourceHeight; j++) {
					
					red = sourceImg.get(i, j).getRed();
					green = sourceImg.get(i, j).getGreen();
					blue = sourceImg.get(i, j).getBlue();
					
					targetImg.set(j, sourceWidth - i - 1, new Color(red, green, blue));
					
				}
			}
			
			targetImg.show();	
			break;
			
		default:
			System.out.println("Not a valid rotational angle");
		}
		
	}
	
	// 7 - mirror in x
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
	// 8 - mirror in y
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
	// 9
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
       } target.show();
   }
	
	// 10
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
	// 11
   public static void resizeImage(Picture sourceImg, double scaleX, double scaleY) {
       int width = sourceImg.width();
       int height = sourceImg.height();
       int newWidth = (int) (scaleX * width);
       int newHeight = (int) (scaleY * height);
       Picture targetImg = new Picture(newWidth, newHeight);
       for (int i = 0; i < newWidth; i++) {
           for (int j = 0; j < newHeight; j++) {
               int srcX = Math.min((int)(i / scaleX), width - 1);
               int srcY = Math.min((int)(j / scaleY), height - 1);
               targetImg.set(i, j, sourceImg.get(srcX, srcY));
           }
       }
       targetImg.show();
   }
  
   // 12 - crop image
   public static void cropImage(Picture sourceImg, int x1, int y1, int x2, int y2) {
   		
   		int red, green, blue;
   		int width = sourceImg.width();
		int height = sourceImg.height();
		
		if (!(x2 >= x1 && y2 >= y1 && 1 < x2 && x2 < width && 1 < y2 && y2 < height)) {
			System.out.println("not valid parameters");
			return;
		}
		
		Picture targetImg = new Picture(x2 - x1, y2 - y1);
		for (int i = x1; i < x2 - 1; i++) {
			for (int j = y1; j < y2 - 1; j++) {
				
				red = sourceImg.get(i, j).getRed();
				green = sourceImg.get(i, j).getGreen();
				blue = sourceImg.get(i, j).getBlue();
				
				targetImg.set(i - x1, j - y1, new Color(red, green, blue));
				
			}
		}
		targetImg.show();
					
   }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Picture sourceImg = new Picture("C:\\Users\\benon\\OneDrive\\Desktop\\ECE 115 Practice codes\\PU-Campus-1.jpg");
		//showGreen(sourceImg);
		//showBlue(sourceImg);
		//rotate(sourceImg, 180);
		//mirrorX(sourceImg);
		//mirrorY(sourceImg);
		//cropImage(sourceImg, 1000, 500, 1900, 1000);
		//visualEffectY(sourceImg);
		//makeBrighter(sourceImg, 200);
		//makeDarker(sourceImg, 200);
		//visualEffectX(sourceImg);
       
        //ask user for what operation to perform and each operation is assigned to a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation number (1-12) you want to perform on the image: \n 1. Show Green Component\n2. Show Blue Component\n3. Rotate Image 180 Degrees\n4. Flip Horizontally\n5. Flip Vertically\n6. Crop Image\n7. Visual Effect Y\n8. Make Brighter\n9. Make Darker\n10. Visual Effect X\n11. Resize Image\n12. Crop Image");
        int operation = scanner.nextInt();

		switch (operation) {
			case 1:
				showGreen(sourceImg);
				break;
			case 2:
				showBlue(sourceImg);
				break;
			case 3:
				rotate(sourceImg, 180);
				break;
			case 4:
				mirrorX(sourceImg);
				break;
			case 5:
				mirrorY(sourceImg);
				break;
			case 6:
				cropImage(sourceImg, 1000, 500, 1900, 1000);
				break;
			case 7:
				visualEffectY(sourceImg);
				break;
			case 8:
				makeBrighter(sourceImg, 200);
				break;
			case 9:
				makeDarker(sourceImg, 200);
				break;
			case 10:
				visualEffectX(sourceImg);
				break;
			case 11:
				System.out.println("Enter scale factor for X axis: ");
				double scaleX = scanner.nextDouble();
				System.out.println("Enter scale factor for Y axis: ");
				double scaleY = scanner.nextDouble();
				resizeImage(sourceImg, scaleX, scaleY);
				break;
			case 12:
				cropImage(sourceImg, 1000, 500, 1900, 1000);
				break;
			default:
				System.out.println("Invalid operation number.");
        
		}
        scanner.close();
	}
}



