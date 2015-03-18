package org.q3project.whileloops.whiles;

public class WhileBasicExample {
	public static void main(String[] args) {
		boolean test = true;
		
		int x = 0;
		
		while(test) {
			System.out.println("HEY THERE");
			
			
			System.out.println("NUM: " + x);
			x++;
			if ( x > 300000) {
				test = false;
			}
			
		}
		
		System.out.println("DONE");
	}
}
