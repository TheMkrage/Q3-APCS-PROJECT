package org.q3project.operators.equality;

import java.util.Scanner;

public class EqualityInstanceOfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		if(scan instanceof Scanner) {
			System.out.println("IS A SCANNER");
		}
	}
}
