package org.q3project.operators.conditional;

public class ConditionalAndOrExamples {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;

		if (x == 5 && y == 4) {
			System.out.println("BOTH ARE TRUE");
		}

		if (x == 5 || y == 4) {
			System.out.println("ONE IS TRUE");
		}
	}
}
