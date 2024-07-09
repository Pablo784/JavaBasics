import java.util.Random;
public class FreqArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int arr[] = new int[50];
		int freq[] = new int[4];
		Random r = new Random(673);
		for (int index = 0; index<arr.length; index++) {
			number = r.nextInt(40) + 60;
			arr[index] = number;
		}
		for (int index = 0; index<arr.length; index++) {
			freq[arr[index]-60/10]++;	
		}
		printarray(freq);
		
	}

	public static void printarray(int[] inarray) {
		System.out.println();
		for (int j=0; j<inarray.length; j++) {
			System.out.print(" " + inarray[j]);
		}
	}    
	
}

/*
60 1  0-9 , 10-19 -1 20-29 2 , 30-39 - 3 
70 1 
80 3
90 
 */
