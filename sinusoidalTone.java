import java.util.Scanner;

import external.StdAudio;

public class sinusoidalTone {
public static void sinWave(double maxFreq, double minFreq, double deltaF, double duration){
    int sampRate=StdAudio.SAMPLE_RATE;
    int sigLength=(int)(duration*sampRate);
    double sampPeriod=1.0/sampRate;
    double[] wave=new double[sigLength];

    for(double i=minFreq;i<=maxFreq;i+=deltaF){
        for(int j=0;j<sigLength;j++){
            wave[j]= (double)Math.sin(2*Math.PI*i*sampPeriod*j);

        }
        StdAudio.play(wave);
       }
    for(double i=maxFreq;i>=minFreq;i-=deltaF){
        for(int j=0;j<sigLength;j++){
            wave[j]=(double)Math.sin(2*Math.PI*i*sampPeriod*j);
}
        StdAudio.play(wave);}
}
public static void main(String[] args){
    Scanner scanner=new Scanner (System.in);
    System.out.println("Enter max frequency:");
    double maxFreq=scanner.nextDouble();
    System.out.println("Enter min frequency:");
    double minFreq=scanner.nextDouble();
    System.out.println("Enter deltaF:");
    double deltaF=scanner.nextDouble();
    System.out.println("Enter duration:");
    double duration=scanner.nextDouble();

    sinWave( maxFreq, minFreq, deltaF, duration);
    scanner.close();
}
}
