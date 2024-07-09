import javax.swing.JOptionPane; 

public class ClassExample {

	public static void main(String[] args) {
		int i = 3;
		int j;
		j = 3;
		String s;
		s = "abc";
		j = i*2;
		System.out.println(j);
		String inname;
		inname = JOptionPane.showInputDialog("Enter name");
		System.out.println("Your name is: " + inname);
		
		int test1,test2;
		test1 = Integer.parseInt(JOptionPane.showInputDialog("Enter test value"));
		test2 = Integer.parseInt(JOptionPane.showInputDialog("Enter test value"));
		System.out.println(((double)test1+test2)/2);
		//System.out.println(((double)test1+test2)/2);
		double average = (test1+test2) / 2;
		String result = Double.toString(average);
		JOptionPane.showMessageDialog(null, "Your average is " + result);
		
		
		/*
		 * y = 5 
		  
		  else:
		 * z = 6
		 */
		int x = 5;
		if (x>4) {
			// THEN STUFF y = 5
			
			
		} else {
			// ELSE STUFF z = 6 
		}
		
		// output if the test average is a passing grade which is 70 or higher
		
		
		test1 = Integer.parseInt(JOptionPane.showInputDialog("Enter test value"));
		test2 = Integer.parseInt(JOptionPane.showInputDialog("Enter test value"));
		System.out.println(((double)test1+test2)/2);
		//System.out.println(((double)test1+test2)/2);
		average = (test1+test2) / 100;
		result = Double.toString(average);
		JOptionPane.showMessageDialog(null, "Your average is" + result);
		
		int mycode;
		mycode = Integer.parseInt(JOptionPane.showInputDialog("Enter account code"));
		
		if (mycode==1) {
			JOptionPane.showMessageDialog( null, "This account is active");
		if (mycode==2);
			JOptionPane.showMessageDialog( null, "This account is inactive");
		
		if (mycode==3); {
			JOptionPane.showMessageDialog(null , "This account is closed");
		
		if (mycode==4); {
			JOptionPane.showMessageDialog( null, "This account is invalid");
		}
		}
		
		}
		
		
		

	}

}
