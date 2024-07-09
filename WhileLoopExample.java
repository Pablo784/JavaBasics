import java.util.Random;
public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random (47);
		int money = 0;
		while (money < 200) {
			int gift = r.nextInt(50);
			System.out.println("gift: " +gift + "\tmoney: " + money);
			money = money + gift;
			
		}
		System.out.println("My Money:" + money);
	}

}
