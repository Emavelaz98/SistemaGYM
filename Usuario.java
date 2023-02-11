import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Usuario extends JFrame implements ActionListener{

	private JLabel label1, label2, label3, label4; 
	private JTextField textfield1;
	private JPasswordField password1;
	private JButton boton1;
	public static String text1 = "", text2 = "";

	public Usuario(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(131,36,182));
		setIconImage(new ImageIcon(getClass().getResource("image/icon.png")).getImage());

		ImageIcon image = new ImageIcon("image/logo.png");
		label1 = new JLabel(image);
		label1.setBounds(160,35,300,150);
		add(label1);

		label2 = new JLabel("Gym Emanuel Velazquez");
		label2.setBounds(105,55,500,300);
		label2.setFont(new Font("Brownie The Bear", 3, 35));
		label2.setForeground(new Color(255,255,255));
		add(label2);

		label3 = new JLabel("Ingrese Usuario");
		label3.setBounds(225,190,300,150);
		label3.setFont(new Font("Brownie The Bear", 2, 25));
		label3.setForeground(new Color(255,255,255));
		add(label3);

		textfield1 = new JTextField();
		textfield1.setBounds(160,288,300,35);
		textfield1.setFont(new Font("Andale Mono", 3, 18));
		textfield1.setForeground(new Color(255,255,255));
		textfield1.setBorder(BorderFactory.createLineBorder(new Color(255,99,71)));
		textfield1.requestFocus();
		textfield1.setCaretColor(Color.white);
		textfield1.setBackground(new Color(255,99,71));
		add(textfield1);

		label4 = new JLabel("Ingrese Contraceña");
		label4.setBounds(205,280,300,150);
		label4.setFont(new Font("Brownie The Bear", 2, 25));
		label4.setForeground(new Color(255,255,255));
		add(label4);

		password1 = new JPasswordField();
		password1.setBounds(160,379,300,35);
		password1.setFont(new Font("Andale Mono", 3, 18));
		password1.setForeground(new Color(255,255,255));
		password1.setBorder(BorderFactory.createLineBorder(new Color(255,99,71)));//Poner bordes
		password1.requestFocus();
		password1.setCaretColor(Color.white);
		password1.setBackground(new Color(255,99,71));
		add(password1);

		boton1 = new JButton("Ingresar");
		boton1.setBounds(235,450,150,35);
		boton1.setFont(new Font("Andale Mono", 3, 18));
		boton1.setForeground(new Color(255,255,255));
		boton1.setBorder(BorderFactory.createLineBorder(new Color(255,99,71)));
		boton1.setBackground(new Color(255,99,71));
		add(boton1);
		boton1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			text1 = textfield1.getText().trim();
			text2 = password1.getText().trim();
			if((text1.equals("")) && (text2.equals(""))){
				JOptionPane.showMessageDialog(null, "       Campos Incompletos");
			}else if(text1.equals("")){
				JOptionPane.showMessageDialog(null, "          Ingrese Usuario");
			}else if(text2.equals("")){
				JOptionPane.showMessageDialog(null, "       Ingrese Contraceña");
			}else{
				JOptionPane.showMessageDialog(null, "     Bienvenido");
			}
		}
	}

	public static void main(String args[]){
		Usuario usuario1 = new Usuario();
		usuario1.setBounds(0,0,650,650);
		usuario1.setVisible(true);
		usuario1.setLocationRelativeTo(null);
		usuario1.setResizable(false);
	}
}