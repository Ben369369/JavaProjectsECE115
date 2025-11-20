import java.util.Scanner;

import external.StdAudio;
public class playmusic {

    //method to play music at twice the speed if k=2 , play at normal speed if k=1,play backward if k=-1, the user enters an array of length 3 with the numbers
    public static void audioProcessor(String filePath, int k) {
        double[] audioData = StdAudio.read(filePath);
        double[] processedData;
        if (k == 2) {
            processedData = new double[audioData.length / 2];
            for (int j = 0; j < processedData.length; j++) {
                processedData[j] = audioData[j * 2];
            }
        } else if (k == 1) {
            processedData = audioData;
        } else if (k == -1) {
            processedData = new double[audioData.length];
            for (int j = 0; j < audioData.length; j++) {
                processedData[j] = audioData[audioData.length - 1 - j];
            }
        } else {
            System.out.println("Invalid input. Please enter 2 for double speed, 1 for normal speed, or -1 for reverse.");
            return;
        }

            StdAudio.play(processedData);
    }

    public static void main(String[] args) {


        String filePath1 = "C:\\Users\\benon\\OneDrive\\Desktop\\ECE 115 Practice codes\\songs\\songs\\africa-toto.wav";
        String filePath2 = "C:\\Users\\benon\\OneDrive\\Desktop\\ECE 115 Practice codes\\songs\\songs\\beautifullife-aceofbase.wav";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one integer (2 for double speed, 1 for normal speed, -1 for reverse):");
        int k = scanner.nextInt();
        scanner.close();
        audioProcessor(filePath1, k);
        audioProcessor(filePath2, k);
    }
}
