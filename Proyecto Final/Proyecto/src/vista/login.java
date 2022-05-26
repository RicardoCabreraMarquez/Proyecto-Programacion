package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuarioInicio;
	private JTextField textContrasenaInicio;

	public login() {
		 
		this.setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.WHITE);
		panel.setBounds(33, 30, 817, 596);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(login.class.getResource("/Imagenes/logo.jpg")));
		lblLogo.setBounds(268, 61, 262, 96);
		lblLogo.setOpaque(true);
		panel.add(lblLogo);
		
		textUsuarioInicio = new JTextField();
		textUsuarioInicio.setBounds(268, 223, 262, 30);
		panel.add(textUsuarioInicio);
		textUsuarioInicio.setColumns(10);
		
		textContrasenaInicio = new JTextField();
		textContrasenaInicio.setColumns(10);
		textContrasenaInicio.setBounds(268, 299, 262, 30);
		panel.add(textContrasenaInicio);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(268, 198, 91, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(268, 274, 91, 14);
		panel.add(lblNewLabel_1_1);
		
		JCheckBox chckbxRecuerdame = new JCheckBox("Recuerdame");
		chckbxRecuerdame.setBackground(Color.WHITE);
		chckbxRecuerdame.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxRecuerdame.setBounds(336, 354, 110, 23);
		panel.add(chckbxRecuerdame);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxRecuerdame.isSelected()) {
					
					String nombreUsuario = (textUsuarioInicio.getText());
					String contraseña = (textContrasenaInicio.getText());
					
					new ControladorUsuario().crearFicheroUsuario(nombreUsuario, contraseña);
					
					new inicio().setVisible(true);
					dispose();
				} else {
					new inicio().setVisible(true);
					dispose();
					JOptionPane.showMessageDialog(null, "¡Has Entrado en modo invitado!");
				}
			}
		});
		btnEntrar.setBounds(324, 395, 139, 49);
		btnEntrar.setBackground(new Color(255,52,51));
		panel.add(btnEntrar);
		
		JLabel lblNewLabel_2 = new JLabel("\u00BFNo tienes cuenta?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(336, 473, 116, 14);
		panel.add(lblNewLabel_2);
		
		
		
		JButton btnRegistrate = new JButton("Registrate.");
		btnRegistrate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrate.setOpaque(false);
		btnRegistrate.setContentAreaFilled(false);
		btnRegistrate.setBorderPainted(false);
		btnRegistrate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new registro().setVisible(true);
					dispose();
			}
		});
		btnRegistrate.setBounds(336, 488, 110, 30);
		panel.add(btnRegistrate);
		
		
		
		
		JLabel lblfondo = new JLabel("");
		lblfondo.setIcon(new ImageIcon(login.class.getResource("/Imagenes/Fondo.jpg")));
		lblfondo.setBounds(0, 0, 884, 661);
		lblfondo.setOpaque(true);
		contentPane.add(lblfondo);
		
		setVisible(true);
		
		
	}
}
