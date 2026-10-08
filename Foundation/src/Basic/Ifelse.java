package Basic;
import java.util.*;
public class Ifelse {
	public static void main(String[] args) {
//		int days = 365;
//				if(days%4==0 && days ) {
//					System.out.println("Not a leap year");
//				}else {
//					System.out.println("It's a leap year");
//				}
		
		int number = 65;
		
//		scanner.sc = new Scanner(System.in);       // predefine method take input from the system 
//		int num = sc.nextInt();                    // take a input from the user
		
		
		if(number >= 90) {
			System.out.println("A+");
		}else if(number >= 80) {
			System.out.println("A");
		}else if(number >= 70) {
			System.out.println("B+");
		}else if(number >= 60) {
			System.out.println("B");
		}else if(number >= 50) {
			System.out.println("C+");
		}else if(number >= 40) {
			System.out.println("C");
		}else if(number >= 30) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
