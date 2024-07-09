import javax.swing.JOptionPane;

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 * 
	 *  if (question - conditional) {
	 *  	THEN statements when question / conditional is true
	 *  } else {
	 * 
	 * 		ELSE statement when question / conditional if false
	 * }
	 * 	
	 * 
	 * 
	 */
		
		String incode = JOptionPane.showInputDialog("Enter Account Code"); 
		int acctyear = Integer.parseInt(JOptionPane.showInputDialog("Enter Account Year"));
		int mycode = Integer.parseInt(incode);
		if (mycode == 1 && acctyear <= 2020 ) {
			JOptionPane.showMessageDialog(null, "Active");
	} else {
		if (mycode == 2 && acctyear <= 2020) {
			JOptionPane.showMessageDialog(null, "Inactive");
	} else {
		if (mycode == 3 && acctyear <= 2020) {
			JOptionPane.showMessageDialog(null, "Closed");
	} else if (acctyear < 2020) {
		JOptionPane.showMessageDialog(null, "INVALID!");
	
		
	if (mycode == 1 && acctyear > 2020) {
		JOptionPane.showMessageDialog(null, "New Code - Active");
	} else { 
		if (mycode == 2 && acctyear > 2020) { 
			JOptionPane.showMessageDialog(null, "New Code - Inactive");
		} else {
			if (mycode == 3 & acctyear > 2020) {
				JOptionPane.showMessageDialog(null, "New Code - Closed");
			} else if (acctyear > 2020) {
				JOptionPane.showMessageDialog(null, "Invalid");
			}
		}
	}
		}
	}
} 
		
	}

// input age 
//  input GPA 
// if the person is older than 20 and GPA > 3.5 then they are eligible for the scholarship
	
	
	double GPA = Double.parseInt(JOptionPane.showInputDialog("Enter GPA"));
	int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); {

	if (GPA == 3.5 && age > 20) {
		
		JOptionPane.showMessageDialog(null, "You are Eligible for the scholarship"); {
	} else {
	
	JOptionPane.showMessageDialog(null, "You are inelgible for the scholarship"); {
		{
	}
	
// input height in inches 
// input running speed for a 40 yard dash (4.4,5,6.3)
// if the person is taller than 6 feet, and runs faster than a 4.4 440 yard dash then the person can make the basketball team
// else try baseball	
	
	int runningspeed = Integer.parseInt(JOptionPane.showInputDialog("Enter your running speed")); {
	double height = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Height in Inches")); 
		
		if (runningspeed == 4.4 && height > 6) {
			JOptionPane.showMessageDialog(null, "You can make the basketball team");
			
		} else {
			JOptionPane.showMessageDialog(null, "You should try for the Baseball team"); }
		}
	{
	
	
	
	// input age
	// input college
	// input gradyear
	// if the person gradyear < 2022 or age > 30
	
	int gradyear = Integer.parseInt(JOptionPane.showInputDialog("Enter Grad year"));
	int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age")); {
	
		if (gradyear <= 2022 || age > 30) {
			JOptionPane.showMessageDialog(null, "Eligible");
		} else {
			
		JOptionPane.showMessageDialog(null, "Not Eligible");
		
		}
		
	// height is over 6 and a half feet or your vertical leap reaches 70 inches
	// then try out for volleyball
		
	int height = Integer.parseInt(JOptionPane.showInputDialog("Enter Height"));
	double leap = Double.parseDouble("Enter vertical Leap");
	if (height > 78 || leap > 72) {
	}	JOptionPane.showMessageDialog(null, "Join the volleyball team");
			}
		}

	
	
	// 1 - active 2 - inactive  3 - closed  any other code - invalid
	
	switch(mycode) {
	case 1: JOptionPane.showMessageDialog(null,  "active"); break;
	case 2: JOptionPane.showMessageDialog(null, "inactive"); break;
	case 3: JOptionPane.showMessageDialog(null, "closed"); break;
	default:
		JOptionPane.showMessageDialog(null,"Invalid"); break;
		}
		
	/*	
	 * Input the graduation year and say what class 
	 * 2022 then you are a senior
	 * 2023 then you are a junior
	 * 2024 a sophomore
	 * 2025 freshman
	 * anything unknown
	 */
		
		
	switch(year) {
	case 2022: JOptionPane.showMessageDialog(null, "You are a senior"); break;
	case 2023: JOptionPane.showMessageDialog(null, "You are a junior"); break;
	case 2024: JOptionPane.showMessageDialog(null, "You are a sophomore"); break;
	case 2025: JOptionPane.showMessageDialog(null, "You are a freshman"); break;
	default:
		JOptionPane.showMessageDialog(null, "Are you even a student?"); break;
	
		}
		}
	}
	
	{
		
			
		}


	


	
	
			
		
	
	 
	
		
		
		
		
		
	