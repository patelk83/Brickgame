package bBracker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj= new JFrame();
		PlayGame gameplay = new PlayGame();
		obj.setBounds(10,10,700,600);
		obj.setTitle("Brick Bracker Game");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
		
		
		
		
	}

}
