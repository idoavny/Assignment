package assignment_1;
import java.util.Scanner;
public class time_to_seconds {
static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) {
		final int dayToSec = 60 * 60 * 24;
		final int hourToSec = 60 * 60;
		final int minutesToSec = 60;
		int result;
			
		System.out.print("Enter days: ");
				int Day = input.nextInt();
		System.out.print("Enter hours: ");
				int hour = input.nextInt(); //sync test
		System.out.print("Enter minutes: ");
				int Min = input.nextInt();
		result = Day*dayToSec + hour*hourToSec + Min*minutesToSec;	
	 
	
	if(Day == 1) {
		 System.out.println(Day +" day, " + hour +" hours, " + "and " + Min + " Minutes");
		 System.out.println("equals: " + result + " " + "Seconds");
	}
	 
	 				
	 else {
		 System.out.println(Day +" days, " + hour +" hours, " + Min + "Minutes");
		 System.out.println("equals: " + result + " " + "Seconds");
	 		}
	
	}

  }