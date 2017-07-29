package candycrush;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
			
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle=JOptionPane.showInputDialog(" My first is often at the front door.My second is found in the cereal family.My third is what most people want. My whole is one of the united states");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
				if (riddle.equals("Matrimony")) {
					JOptionPane.showMessageDialog(null,"Correct");
					
				}else{
				JOptionPane.showMessageDialog(null,"Wrong,the answer is Matrimony ");	
				}
				}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}

