import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
		int animal = JOptionPane.showOptionDialog(null, "What's your favorite farm animal?", "Animal Farm", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "cow", "duck", "dog","llama", "stop" }, null);	
	
	while(animal!=3)	{
	
	if(animal==(0)){
		playMoo();
	}
	if(animal==(1)){
		playQuack();
	}
		
	if(animal==(2)){
		playWoof();
	}
	
	if(animal==(4)){
		playLlama();
	}
		animal = JOptionPane.showOptionDialog(null, "What's your favorite farm animal?", "Animal Farm", 0,
			JOptionPane.INFORMATION_MESSAGE, null, new String[] { "cow", "duck", "dog","stop" }, null);	
	}
	}

	void playMoo() {
		playNoise(mooFile);

	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	
	void playLlama(){
		playNoise(llamaFile);
	}
	
	String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}

