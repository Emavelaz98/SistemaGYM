import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;


public class Principal extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu menuOpciones, menuAcercaDe, menuColorFondo;
	private JMenuItem miSalmo, miVioleta, miRosado, miSalir, miNuevo;
	private JLabel label1, label2, label3, label4, label5,label6, label7;
	private JTextField textfield1, textfield2, textfield3, textfield4,textfield5, textfield6;
	private JButton boton1;
	private String nombreAdministrado = "";//Pedir nombre al usuario en la ventana Usuario

	public Principal(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);	
		this.setVisible(true);
		Usuario nombreUsa = new Usuario();
		nombreAdministrado = nombreUsa.text1;
		setTitle("Bienvenido " + nombreAdministrado);
		getContentPane().setBackground(new Color(131,36,182));
		setIconImage(new ImageIcon(getClass().getResource("image/icon.png")).getImage());

		//Menu 
		mb=new JMenuBar();
		mb.setBackground(new Color(131,36,182));
		setJMenuBar(mb);

		//Menu Desplegable
		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(131,36,182));
		menuOpciones.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.setForeground(new Color(255,255,255));
		mb.add(menuOpciones);

		menuAcercaDe=new JMenu("Acerca De");
		menuAcercaDe.setBackground(new Color(131,36,182));
		menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
		menuAcercaDe.setForeground(new Color(255,255,255));
		mb.add(menuAcercaDe);

		//Sub-Menu-Color
		menuColorFondo=new JMenu("Color de Fondo");
		menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.setForeground(new Color(0,0,0));
		menuOpciones.add(menuColorFondo);

		miSalmo=new JMenuItem("Salmon");
		miSalmo.setFont(new Font("Andale Mono", 1, 14));
		miSalmo.setForeground(new Color(0,0,0));
		menuColorFondo.add(miSalmo);
		miSalmo.addActionListener(this);

		miVioleta = new JMenuItem("Violeta");
		miVioleta.setFont(new Font("Andale Mono", 1, 14));
		miVioleta.setForeground(new Color(0,0,0));
		menuColorFondo.add(miVioleta);
		miVioleta.addActionListener(this);

		miRosado = new JMenuItem("Rosado");
		miRosado.setFont(new Font("Andale Mono", 1, 14));
		miRosado.setForeground(new Color(0,0,0));
		menuColorFondo.add(miRosado);
		miRosado.addActionListener(this);

		//Sub-Menu Salir y Nuevo

		miNuevo= new JMenuItem("Nuevo");
		miNuevo.setFont(new Font("Andale Mono", 1, 14));
		miNuevo.setForeground(new Color(0,0,0));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);


		miSalir=new JMenuItem("Salir");
		miSalir.setFont(new Font("Andale Mono", 1, 14));
		miSalir.setForeground(new Color(0,0,0));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);

		//Icono del Gimnasio
		ImageIcon image = new ImageIcon("image/logo.png");
		label1 = new JLabel(image);
		label1.setBounds(485,45,300,150);
		add(label1);
	}

	public void actionPerformed(ActionEvent e){


		if(e.getSource () == miSalir){
			Usuario usuario1 = new Usuario();
			usuario1.setBounds(0,0,650,650);
			usuario1.setVisible(true);
			usuario1.setLocationRelativeTo(null);
			usuario1.setResizable(false);
			this.setVisible(false);
		}

		if(e.getSource() == miSalmo){
			getContentPane().setBackground(new Color(255, 140, 105));
			mb.setBackground(new Color(255, 140, 105));
		}
		if(e.getSource()==miRosado){
			getContentPane().setBackground(new Color(255, 192,203));
			mb.setBackground(new Color(255, 192, 203));
		}
		if(e.getSource()==miVioleta){
			getContentPane().setBackground(new Color(25,0,50));
			mb.setBackground(new Color(25,0,50));
		}
	}

	public static void main(String args[]){
		Principal principal1 = new Principal();
		principal1.setVisible(true);
		principal1.setLocationRelativeTo(null);
		principal1.setResizable(true);



	}
}