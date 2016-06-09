import java.util.Random;

import javax.swing.JOptionPane;


public class HighLowGame {

	public static void main(String[] args) {
				int random = new Random().nextInt(100);
		
		System.out.println(random);
	for(int i=0;i<100;i++){	
String guess= JOptionPane.showInputDialog(null, "Guess a number between 1 and 100.");

	 int answer = Integer.parseInt(guess);
			
	  if(answer==random){ 
		JOptionPane.showMessageDialog(null, "winner");
	 System.exit(0);
	  }
	 
		
	 else if(answer<random){	
		JOptionPane.showMessageDialog(null,"too low, guess again");			
	}		
			
	 else if(answer>random){
		JOptionPane.showMessageDialog(null,"too high, guess again");				
	 }			
}
	
}	
}




