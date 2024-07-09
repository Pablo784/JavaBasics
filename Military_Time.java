import javax.swing.JOptionPane; 
public class Military_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int milit_time = 0;
		milit_time = Integer.parseInt(JOptionPane.showInputDialog("Enter Military time to convert into normal time:"));
		String outhours = null;
		
		if (milit_time==0) {
		outhours = "12AM";	
		}
		
		if (milit_time==100) {
		outhours = "1AM";	
		}
		
		if (milit_time==200) {
		outhours = "2AM";
		}
		
		if (milit_time==1100) {
		outhours = "11AM";
		}
		
		if (milit_time==1200) {
		outhours = "12PM";

		}
		
		if (milit_time==1300) {
		outhours = "1PM";
		}
		
		if (milit_time==1400) {
		outhours = "2PM";
		}
		 
		if (milit_time==2300) {
		outhours = "11PM";
		}
		
		JOptionPane.showMessageDialog(null, "The time will be" + outhours);

	}

}
