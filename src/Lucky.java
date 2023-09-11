import java.util.Scanner;
import java.util.Random;


public class Lucky {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int min = 1;
		int max = 9;
		String win = "7";
		
		int n1 = random.nextInt(max + min) + min;
		int n2 = random.nextInt(max + min) + min;
		int n3 = random.nextInt(max + min) + min;
		
		String n1str = String.valueOf(n1);
		String n2str = String.valueOf(n2);
		String n3str = String.valueOf(n3);
		
		System.out.println(n1str + " " + n2str + " " + n3str);
		
		if(n1str.equals(win) || n2str.equals(win) || n3str.equals(win) ) {
			System.out.println("You Win!");
		}
		
	}

}
