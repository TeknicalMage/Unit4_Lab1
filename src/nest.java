//Julian Jordan Unit_4_Lab_1
	
//11/7/2018 
import java.util.Scanner;

public class nest {
	
	public nest(){
		main();		
	}
	
	public void main() {
		//Driver Input
		System.out.println("Please select an option below");
		display();
		Scanner input = new Scanner(System.in);
		String h = input.nextLine();
		if(h.equals("A")) {
			System.out.println("Type the amount of rows you want");
			int i = input.nextInt();
			if(i <= 0) {
				System.out.println("Value not recognized. Please re-select and try again");
				main();
			}else {
			for (int j = 1; j <= i; ++j) {
				for (int k = i; k >= 1; k--) {				
				 System.out.print("*");
				}
				System.out.println();	
			}
			System.out.println();
			main();
			}
		}else if(h.equals("B")) {
			System.out.println("Type the amount of rows you want");
			int i = input.nextInt();
			if(i <= 0) {
				System.out.println("Value not recognized. Please re-select and try again");
				main();
			}else {
			for (int j = 0; j <= i; ++j) {
				 for (int k = j-1; k >= 0; k--) {
					 System.out.print("*");
				 }
				 System.out.println();
			 }			
			main();
			}
		}else if(h.equals("C")) {
			System.out.println("Type the amount of rows you want");
			int i = input.nextInt();
			if(i <= 0) {
				System.out.println("Value not recognized. Please re-select and try again");
				main();
			}else {
			int count = i;
			for(int p = 0; p < i;p++) {
				System.out.println();
				for(int o = 0; o < count; o++) {
					System.out.print("*");
				}
				count = count -1;
			}
				System.out.println();
				main();			
			}
		}else if(h.equals("D")) {
			System.out.println("Type the amount of rows you want");
			int i = 2 * input.nextInt();
			if(i <= 0) {
				System.out.println("Value not recognized. Please re-select and try again");
				main();
			}else {
			int t = i;
			for(int p = 0; p <= i;p++) {
				if(p % 2 != 0) {
				for(int j = 0; j < p; j++) {
				System.out.print("*");
				}
				}
				if(p % 2 == 0) {
				System.out.println();
				}
				for(int o = 0; o - 1 < t ; o++) {
					if(o % 2 != 0) {
					System.out.print(" ");
					}
				}
				t--;
			}
				System.out.println();
				main();	
			}
		}else if(h.equals("E")) {
			System.exit(0);
		}else {
			System.out.println("Input failed");
			System.out.println("Try Again");
			System.out.println("");
			main();
		}
	}
	//Displayed Options
	public static void display() {
		System.out.println("Type A to make a Box");
		System.out.println("Type B to make a Left aligned Triangle");
		System.out.println("Type C to make a Right alinged Triangle");
		System.out.println("Type D to make a Center Triangle");
		System.out.println("Type E to exit");
	}
	
	public static void main(String[] args) {
		new nest();
	}

}
