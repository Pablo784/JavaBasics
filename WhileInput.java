import javax.swing.JOptionPane;

import javax.util.Random;

public class WhileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String ans;
		ans = JOptionPane.showInputDialog("Enter a test score or the word 'DONE' ");
		while (!ans.equals("DONE")); {
			// add the input value to our running test total
			ans = JOptionPane.showInputDialog("Enter a test score or the word 'DONE' "); {
		}
			// output the results - average of the test scores 
			// Example 80 90 85 DONE --- output 85 
			
	}


			// while loop that select numbers from 1-100, and count how many numbers 
			// until the number appears twice in a row
			// randomly pick 12 42 23 53 53 - answer 4 number
			
			Random r = new Random(31);
			int lastnumber = -1;
			int number = 0;
			int picks = 0;
			while (lastnumber != number ) {
				lastnumber = number;
				number = r.nextInt(100)+1; 
				picks++;
				
			}
			System.out.println(picks);
	}
	
	
	
	
	

