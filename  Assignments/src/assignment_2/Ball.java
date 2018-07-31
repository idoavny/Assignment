package assignment_2;

public class Ball {
private final int radius;
	public  Ball(int radius) {
	this.radius = radius;
		}
	public double getSurFaceArea() {
		return 4*Math.PI*Math.pow(radius, 2);
		}
	public double getVolume() {
		return (4*Math.PI*Math.pow(radius, 3))/3;
		}
	}
