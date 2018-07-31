package assignment_3;
import java.util.Scanner;
public class Triangle {
	static Scanner input =new Scanner(System.in);
	public static void main(String args[]) {
		
		
		System.out.print("enter three ribs: ");	
		int rib1 = input.nextInt();
		int rib2 = input.nextInt();
		int rib3 = input.nextInt();
		int perimeter = rib1+rib2+rib3;
		
		
		if(rib1+rib2>rib3 && rib1+rib3>rib2 && rib2+rib3>rib1){
		
			System.out.println("perimeter equals: " + rib1+rib2+rib3);
			System.out.println("area equals: " + Math.sqrt(perimeter*(perimeter-rib1)*(perimeter-rib2)*(perimeter-rib3)));
		}
		else {
			System.out.println("cannot create a triangle");
		}
	
	
	
	}
	
}