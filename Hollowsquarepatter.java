
import java.util.Scanner;


	public class Hollowsquarepatter {
	    public static void main(String[] args) {
	        int sideLength = 5; 
	    }

	    // Method to draw the hollow square
	    public static void drawHollowSquare(int sideLength) {
	        for (int i = 1; i <= sideLength; i++) {
	            for (int j = 1; j <= sideLength; j++) {
	                if (i == 1 || i == sideLength || j == 1 || j == sideLength) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
