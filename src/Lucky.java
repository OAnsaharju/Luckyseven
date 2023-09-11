import java.util.Scanner;
import java.util.Random;


public class Lucky {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		String creditsStr = "";
		int min = 1;
		int max = 9;
		String win = "7";
		String again = "";
		
		System.out.println("Enter game credits: ");
		
		creditsStr = sc.nextLine();
		
		int credits = Integer.parseInt(creditsStr);
		
		do {
			
			
			
			int n1 = random.nextInt(max + min) + min;
			int n2 = random.nextInt(max + min) + min;
			int n3 = random.nextInt(max + min) + min;
			
			String n1str = String.valueOf(n1);
			String n2str = String.valueOf(n2);
			String n3str = String.valueOf(n3);
		
			
			
			System.out.println(n1str + " " + n2str + " " + n3str);
			
			credits = credits -1;
			
			
			
			
			if (n1str.equals(win) && n2str.equals(win) || n1str.equals(win) && n3str.equals(win) || n2str.equals(win) && n3str.equals(win) ) {
				System.out.println("You got 2 sevens! you win 5 credits!");
				credits = credits + 5;
				System.out.println("Credits left: " + credits);
				System.out.println("Do you want to play again? Enter e to exit or press enter to continue");
				again = sc.nextLine();
				if (again.equals("e")) {
					System.out.println("Your end score is: " + credits);
					break;
				}
			}
		   
			else if (n1str.equals(win) || n2str.equals(win) || n3str.equals(win)){
				System.out.println("A seven! You win 3 credits!");
				credits = credits + 3;
			}
		   
			System.out.println("Do you want to play again? Enter 'e' to exit or press enter to continue");
			System.out.println("Credits left: " + credits);
			again = sc.nextLine();
			if (again.equals("e")) {
				System.out.println("Your end score is: " + credits);
				break;
			}
			
			else if (credits == 0) {
				System.out.println("You have run out of credits! Play again and add credits.");
			}
			}
		while (credits > 0);
		
	}

}
