package empericaltesting;

import java.util.Scanner;

/**
 * @author José Escobar
 *
 */
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		boolean c1, c2, c3, isTriangle;

		Scanner reader = new Scanner(System.in);

//		Step 1: Get Input
		do {
			System.out.println("Enter 3 integers which are sides of a triangle");
			System.out.print("a: ");
			a = reader.nextInt();
			System.out.print("b: ");
			b = reader.nextInt();
			System.out.print("c: ");
			c = reader.nextInt();

			c1 = (1 <= a) && (a <= 200);
			c2 = (1 <= b) && (b <= 200);
			c3 = (1 <= c) && (c <= 200);

			if (!c1) {
				System.out.println("Value of a is not in the range of permitted values");
			}
			if (!c2) {
				System.out.println("Value of b is not in the range of permitted values");
			}
			if (!c3) {
				System.out.println("Value of c is not in the range of permitted values");
			}
		} while (!(c1 && c2 && c3));

		reader.close();

//		Step 2: Is A Triangle?
		if ((a < b + c) && (b < a + c) && (c < a + b)) {
			isTriangle = true;
		} else {
			isTriangle = false;
		}

//		Step 3: Determine Triangle Type
		if (isTriangle) {
			if ((a == b) && (b == c)) {
				System.out.println("Equilateral");
			}
			else if ((a != b) && (a != c) && (b != c)) {
				System.out.println("Scalene");
			} 
			else {
				System.out.println("Isosceles");
			}
		} 
		else {
			System.out.println("Not a Triangle");
		}

	}

}
