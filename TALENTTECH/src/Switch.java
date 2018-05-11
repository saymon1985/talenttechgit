import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		int day;
		Scanner s=new Scanner(System.in);
		
		System.out.println("give me the number between 1-3 for diffrent days");
		
		day = s.nextInt();
		
		switch(day) {
		case 1:
		     System.out.println("welcome to monday");
		break;
		
		case 2:
			System.out.println("welcome to tuesday");
			break;
			
		case 3:
			System.out.println("welcome to wednesday");
			break;
			default:
				System.out.println("enter number only between 1-3");
				System.out.println("Outside od the switch");
			
		
		
		}
		
		
		}
		

	}
