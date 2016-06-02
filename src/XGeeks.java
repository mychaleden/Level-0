
//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipies".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String Maria= "storing things in stomach";
String Drew= "excuses that work";
String Mychal="mind compelling";
String Wren="shape shifting";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String superpower="";
String name = JOptionPane.showInputDialog(null, "Enter in a name.");
		if(name.equals("Maria")){
			superpower=Maria;
		}
		if(name.equals("Drew")){
			superpower=Drew;
		}
		if(name.equals("Mychal")){
			superpower=Mychal;
		}
		if(name.equals("Wren")){
			superpower=Wren;
		}
// 3. Show the superpower in a pop-up, depending on the name entered. 
JOptionPane.showMessageDialog(null, name+"'s superpower is "+superpower+"!");
	}
}

