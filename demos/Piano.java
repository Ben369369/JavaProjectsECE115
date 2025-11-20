package demos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

import external.StdAudio;

public class Piano implements KeyListener {
	
	public static double[] sinWave(double freq, double duration) {
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

		JFrame frame = new JFrame("Press your keys in this window:");
		Piano keyboardInput = new Piano();
		frame.addKeyListener(keyboardInput);
		frame.setSize(2000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_1:
			System.out.println("Key 1 pressed.");
			double[] wave = sinWave(1760.00, 0.1);
			StdAudio.play(wave);
			break;
		case KeyEvent.VK_2:
			System.out.println("Key 2 pressed.");
			double[] wave2 = sinWave(1975.50, 0.1);
			StdAudio.play(wave2);
			break;
		case KeyEvent.VK_3:
			System.out.println("Key 3 pressed.");
			double[] wave3 = sinWave(2093.00, 0.1);
			StdAudio.play(wave3);
			break;
		case KeyEvent.VK_4:
			System.out.println("Key 4 pressed.");
			double[] wave4 = sinWave(2349.30, 0.1);
			StdAudio.play(wave4);
			break;
		case KeyEvent.VK_5:
			System.out.println("Key 5 pressed.");
			double[] wave5 = sinWave(2637.02, 0.1);
			StdAudio.play(wave5);
			break;
		case KeyEvent.VK_6:
			System.out.println("Key 6 pressed.");
			double[] wave6 = sinWave(2793.80, 0.1);
			StdAudio.play(wave6);
			break;
		case KeyEvent.VK_7:
			System.out.println("Key 7 pressed.");
			double[] wave7 = sinWave(3126.00, 0.1);
			StdAudio.play(wave7);
			break;
		case KeyEvent.VK_8:
			System.out.println("Key 8 pressed.");
			double[] wave8 = sinWave(3520.00, 0.1);
			StdAudio.play(wave8);
			break;
		case KeyEvent.VK_9:
			System.out.println("Key 9 pressed.");
			double[] wave9 = sinWave(3951.07, 0.1);
			StdAudio.play(wave9);
			break;
		case KeyEvent.VK_0:
			System.out.println("Key 0 pressed.");
			double[] wave10 = sinWave(4186.01, 0.1);
			StdAudio.play(wave10);
			break;
		default:
			// Do nothing.
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Do nothing.
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Do nothing.
	}
}