package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.ControladorUsuario;
import beans.Usuario;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

public class registro extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCorreo;
	private JTextField textUsuario;
	private JPasswordField textContraseña;
	
	public registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(33, 30, 817, 596);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblfondo = new JLabel("");
		lblfondo.setIcon(new ImageIcon(registro.class.getResource("/Imagenes/Fondo.jpg")));
		lblfondo.setBounds(0, 0, 884, 661);
		lblfondo.setOpaque(true);
		contentPane.add(lblfondo);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(registro.class.getResource("/Imagenes/logo.jpg")));
		lblLogo.setBounds(268, 34, 262, 96);
		lblLogo.setOpaque(true);
		panel.add(lblLogo);
		
		JLabel lbl1 = new JLabel("Nombre:");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl1.setBounds(268, 165, 59, 14);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("Corrreo:");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl2.setBounds(268, 231, 59, 14);
		panel.add(lbl2);
		
		JLabel lbl3 = new JLabel("Nombre de Usuario:");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl3.setBounds(268, 297, 122, 14);
		panel.add(lbl3);
		
		JLabel lbl4 = new JLabel("Contrase\u00F1a:");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl4.setBounds(268, 363, 75, 14);
		panel.add(lbl4);
		
		textNombre = new JTextField();
		textNombre.setBounds(268, 190, 262, 30);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(268, 256, 262, 30);
		panel.add(textCorreo);
		
		textUsuario = new JTextField();
		textUsuario.setColumns(10);
		textUsuario.setBounds(268, 322, 262, 30);
		panel.add(textUsuario);
		
		JButton btnRegistrarte = new JButton("REGISTRARTE.");
		btnRegistrarte.setForeground(new Color(255, 255, 255));
		btnRegistrarte.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegistrarte.setBackground(new Color(255,52,51));
		btnRegistrarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String nombre = textNombre.getText();
					String correoElectronico = textCorreo.getText();
					String nombreUsuario = textUsuario.getText();
					String contraseña = textContraseña.getText();
					Usuario usuario = new Usuario(nombre, correoElectronico, nombreUsuario, contraseña);
					
					new ControladorUsuario().crearUsuario(usuario);
					
					} catch(Exception error) {
						JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
						return;
					}
			
				new login().setVisible(true);
				dispose();
				
				
			}
		});
		
		textContraseña = new JPasswordField();
		textContraseña.setBounds(268, 388, 262, 30);
		panel.add(textContraseña);
		btnRegistrarte.setBounds(325, 459, 139, 49);
		panel.add(btnRegistrarte);
		
		setVisible(true);
	}
}
