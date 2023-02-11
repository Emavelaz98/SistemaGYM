import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Calendar;


public class Principal extends JFrame{

	public Principal(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String args[]){
		Principal principal1 = new Principal();
		//principal1.setBounds(0,0,0,0);
		principal1.setVisible(true);
		principal1.setLocationRelativeTo(null);
		principal1.setResizable(true);
	}
}