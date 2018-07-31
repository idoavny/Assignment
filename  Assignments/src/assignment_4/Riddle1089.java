package assignment_4;
import java.util.Scanner;
public class Riddle1089{
	static Scanner input = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.print("please Enter positive three Digit Number: ");
	
		int number = input.nextInt();
		int reverse;
		int difference;
		
		if (number > 0 && String.valueOf(number).length() == 3) {
			System.out.print("The Number: "+number);
		
			reverse = (number%10)*100 +(number-number%10)%100+ number/100;
			System.out.println("reverse equals: "+reverse);
			difference = Math.abs((number - reverse));
			System.out.println("Difference Equals: " + difference);
		
			int reversedifference =  Math.abs(((number - reverse)%10) * 100 +((number - reverse)-(number - reverse)%10)%100+ (number - reverse)/100);
			System.out.println("ReverseDifference Equals: "+reversedifference);
			if((difference + reversedifference) == 1089){
			System.out.println("SUCCEEDED");
			}
			else {
				System.out.println("FAILED");
			}
			}
		else {
			System.out.println("The Number Must be positive with 3 digits");	
			}
		
		
			}
		
		}
	
	
	
	
