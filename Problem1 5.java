import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random(21);
		int numtests=4;
		int total = 0;
		
		int [] tests = new int[numtests];
		for (int i = 0; i<numtests; i++) {
			//tests[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter Test Score");
			int testscore=r.nextInt(40)+60;
			tests[i]=testscore;
			
			for (int i1 = 0; i1 < numtests; i1++) {
				total = total + tests[i1];
				
			}
				System.out.println(tests[i]);
				
		}	
				
				
				int highscore1 = 0;
				
				for (int i2 = 0; i2<numtests; i2++) {
					if (tests[i2]> highscore1) {
						highscore1 = tests[i2];
						
					System.out.println(highscore1);
					
					int number_passed = 0;
					for (int i11 = 0; i11<numtests;) {
						if(tests[i11] >= 70); {number_passed++;}
						
						
					}
					System.out.println(number_passed);
					
					
					
					//Were any tests above 95?
					// searching
					boolean found = false;
					for (int i12 = 0; i12<numtests;i12++) {
						// examine each element tests [i]
						if (tests[i12] >= 95 ) {
						System.out.println("Yes a test was over 95");
						found = true;
						break;
						
						
						}
					}
					
					// after loop
					if (!found) {System.out.println("No test was over 95");}
					
					
			// NY - New York
			// NJ - New Jersey
			// PA - Pennsylvania
					
		String[] names = new String[3];
		names [0] = "New York"; names[1] = "New Jersey"; names[2] = "Pennsylvania";
		
					}
		String searchstate = JOptionPane.showInputDialog("Enter a state abbreviation");
		
		for (int i = 0; i<3; i++) {
			if (args[i].equals(searchstate)) {
				System.out.println("The State name is: " + args[i]);
				break;
				
		// using frequency arrays
			}	
		int[] freqarray = new int[10];
		
			for (int i1 = 1; i1<=100; i1++) {
				int number = r.nextInt(10)+ 1;
				// System.out.print(number + " ");
				if (number == 10) {freqarray[9]=freqarray[9]+1;}
				freqarray[number-1]=freqarray[number-1]+1;
				
				}
			}	
			
			}

				
				for (int i =0; i<10; i++) {
					System.out.print("\n" + (i+1) + "-" + args[i]);
				
			}
				}
			
				
				
	{
				
			
			}
			{
				
			}
			
		
				
				{
					{
					}
					
					}
				{
			
					
					{
				}
				}
				{
				}
				{
					{
						{
							{
							}
							{
							}
						}
					}
}

					
	int[] age = new int[56]; 				
	for (int i = 1; i<=5; i++) {
	}
	int year = Integer.parseInt("Type in the year you were born"); 
	System.out.println(year);
	age[year]++;
		}
		
		System.out.println(age[54]);
		
	}
	

	
	
	
						
			
				

		
			
				
	


	
	
	
	