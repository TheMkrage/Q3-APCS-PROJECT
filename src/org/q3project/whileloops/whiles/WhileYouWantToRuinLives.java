package org.q3project.whileloops.whiles;

import java.util.Random;

import javax.swing.JFrame;

public class WhileYouWantToRuinLives {

	public static void main(String[] args) {
		Random ran = new Random();
		while(true) {
			JFrame frame = new JFrame();
			frame.setLocation(ran.nextInt(1800), ran.nextInt(900));
			frame.setSize(ran.nextInt(800), ran.nextInt(800));
			frame.setVisible(true);
		}
	}
}
