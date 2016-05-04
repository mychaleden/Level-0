
import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String answer = JOptionPane.showInputDialog(null, "who really grinds your gears?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+answer+"!");
		// 3. Ask the user for the name of their best friend
String answer2 = JOptionPane.showInputDialog(null, "who's your best friend?");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, answer2+" is sweet as candy!");
	} 
}


