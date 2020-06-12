package empericaltesting;

import java.util.Scanner;

/**
 * @author José Escobar
 *
 */
public class Triangle<E>{

	public static void main(String[] args) {
        Triangle t=new Triangle<>();
        System.out.println("Test 1: "+ "Equilateral".equals(t.triangleType(3,3,3)));
		System.out.println("Test 2: "+ "Scalene".equals(t.triangleType(5,4,8)));
		System.out.println("Test 3: "+ "Isosceles".equals(t.triangleType(9,"n",9)));
		
	}
	


    public String triangleType(E a_in, E b_in, E c_in) {
		boolean c1, c2, c3, isTriangle;
		int a_out;
		int b_out;
		int c_out;
		try{
			a_out=(int) a_in;
			b_out=(int) b_in;
			c_out=(int) c_in;
		}
		catch(Exception e){
			return "Invalid input";
		}

		c1 = (1 <= a_out) && (a_out <= 200);
        c2 = (1 <= b_out) && (b_out <= 200);
        c3 = (1 <= c_out) && (c_out <= 200);

        if (!c1 || !c2 || !c3) {
            return "Out of range";
        }

//		Step 2: Is A Triangle?
		if ((a_out < b_out + c_out) && (b_out < a_out + c_out) && (c_out < a_out + b_out)) {
			isTriangle = true;
		} else {
			isTriangle = false;
		}

//		Step 3: Determine Triangle Type
		if (isTriangle) {
			if ((a_out == b_out) && (b_out == c_out)) {
				return "Equilateral";
			}
			else if ((a_out != b_out) && (a_out != c_out) && (b_out != c_out)) {
				return "Scalene";
			} 
			else {
				return "Isosceles";
			}
		} 
		else {
			return "Not a Triangle";
		}

    }
}
