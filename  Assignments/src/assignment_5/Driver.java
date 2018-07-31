package assignment_5;
import java.util.Scanner;
public class Driver {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	Box boxy1 = new Box();
		System.out.println("boxy1(default)-  length: " + boxy1.getLength() +" height: "+boxy1.getHeight() +" width: "+boxy1.getWidth());
		boxy1.resize(3);
		System.out.println("boxy1(x3)-  volume: "+boxy1.volume() + " surface area: "+boxy1.surfaceArea());
	
	System.out.print("Enter boxy2 Parameters: ");
	Box boxy2 = new Box(input.nextInt(),input.nextInt(),input.nextInt()); 
		System.out.println("boxy2(user input)-  volume: "+boxy2.volume() + " surface area: "+boxy2.surfaceArea());
		boxy2.resizeToHeight(); 
		System.out.println("boxy2-  length: "+boxy2.getLength()+"  height: "+ boxy2.getHeight()+"  width: "+boxy2.getWidth()+  " volume: "+boxy2.volume()+"  surface area: "+boxy2.surfaceArea() );
	
	System.out.print("Enter boxy3 Parameters: ");	
	Box boxy3 = new Box(input.nextInt());
	System.out.println("boxy2-  length: "+boxy3.getLength()+"  height: "+ boxy3.getHeight()+"  width: "+boxy3.getWidth()+  " volume: "+boxy3.volume()+"  surface area: "+boxy3.surfaceArea() );
	
	input.close();
	}
}
