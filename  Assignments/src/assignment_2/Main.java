package assignment_2;
import java.util.Scanner;
public class Main {
	static Scanner input = new Scanner(System.in);
public static void main(String args[]) {
	System.out.print("Enter ball radius:");
	int radius = input.nextInt();
	Ball values = new Ball(radius);
	
	System.out.println("Ball Radius: " + radius);
	System.out.println("Ball Surface Area: " + values.getSurFaceArea());
	System.out.println("Ball Volume: : " + values.getVolume());
	



		
	
	
	}














}
