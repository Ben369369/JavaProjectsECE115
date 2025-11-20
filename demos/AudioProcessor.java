package demos;

import external.StdAudio;

public class AudioProcessor {

	public static double[] sinWave(int freq, double duration) {
		int sampRate = StdAudio.SAMPLE_RATE;
		int sigLength = (int) (duration * sampRate);
		double sampPeriod = 1.0 / sampRate;
		double[] wave = new double[sigLength];

		for (int i = 0; i < sigLength; i++) {
			wave[i] = (double) Math.sin(2 * Math.PI * freq * sampPeriod * i);
		}
		return wave;
	}

	public static void main(String[] args) {

		double[] wave = sinWave(963, 1);
		StdAudio.play(wave);

	}

}
