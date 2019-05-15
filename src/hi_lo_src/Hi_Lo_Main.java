package hi_lo_src;

import javax.swing.JFrame;


public class Hi_Lo_Main {
	
	public static void main(String[] args){
		Hi_Lo_Game Obj = new Hi_Lo_Game();
		Obj.setSize(340,430);
		Obj.setVisible(true);
		Obj.setLocationRelativeTo(null);
		Obj.setResizable(false);
		Obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
