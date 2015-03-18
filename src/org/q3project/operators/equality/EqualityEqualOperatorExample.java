package org.q3project.operators.equality;

public class EqualityEqualOperatorExample {

	public static void main(String[] args) {
		int x = 5;
		if( x == 5) {
			System.out.println("TRUE");
		}
		
		x++;
		
		if( x == 5) {
			System.out.println("TRUE");
		}
		
		if( x != 5) {
			System.out.println("NOT TRUE");
		}
		
		if( x >= 5) {
			System.out.println("GREATER OR EQUAL TO");
		}
		
		if( x > 5) {
			System.out.println("GREATER");
		}
	}

}
