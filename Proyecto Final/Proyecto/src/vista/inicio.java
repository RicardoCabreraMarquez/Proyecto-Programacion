package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import controlador.ControladorUsuario;

import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class inicio extends JFrame {

	private JPanel contentPane;

	public inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(141, 0, 600, 661);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(583, 0, 17, 661);
		panel.add(scrollBar);
		
		JPanel barra = new JPanel();
		barra.setBounds(0, 0, 590, 85);
		panel.add(barra);
		barra.setBackground(Color.WHITE);
		barra.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		barra.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(inicio.class.getResource("/Imagenes/logoinicio.jpg")));
		lblNewLabel.setBounds(22, 11, 201, 63);
		barra.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new aņadirAmigos().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(inicio.class.getResource("/Imagenes/a\u00F1adirAmigo.jpg")));
		btnNewButton.setBounds(489, 24, 50, 50);
		barra.add(btnNewButton);
		
		JButton btnFoto = new JButton("");
		btnFoto.setIcon(new ImageIcon(inicio.class.getResource("/Imagenes/subirImagen.jpg")));
		btnFoto.setBounds(301, 32, 50, 42);
		barra.add(btnFoto);
		
		
		JLabel lblNombreUsuario = new JLabel("");
		lblNombreUsuario.setBounds(80, 120, 201, 22);
		panel.add(lblNombreUsuario);

		
		JLabel lblfondo = new JLabel("");
		lblfondo.setIcon(new ImageIcon(inicio.class.getResource("/Imagenes/Fondo.jpg")));
		lblfondo.setBounds(0, 0, 884, 661);
		contentPane.add(lblfondo);
		
		
		
		btnFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JFileChooser chooser = new JFileChooser();
					FileNameExtensionFilter filter = new FileNameExtensionFilter(
				    "JPG & GIF Images", "jpg", "gif");
				   chooser.setFileFilter(filter);
				   int returnVal = chooser.showOpenDialog(null);
				   if(returnVal == JFileChooser.APPROVE_OPTION) {
				    	String path = chooser.getSelectedFile().getAbsolutePath();
				    	JLabel lblNewLabel_2 = new JLabel("");
						lblNewLabel_2.setBounds(80, 170, 413, 300);
						panel.add(lblNewLabel_2);
				     	lblNewLabel_2.setIcon(new ImageIcon(path));

						JButton btnLike = new JButton("");
						btnLike.setIcon(new ImageIcon(inicio.class.getResource("/Imagenes/like.jpg")));
						btnLike.setBounds(200, 458, 67, 40);
						panel.add(btnLike);
						
						
						btnLike.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int votos = 0;
								votos = votos + 1;
								
								JLabel lblLike = new JLabel(Integer.toString(votos));
								lblLike.setBounds(230, 500, 17, 22);
								panel.add(lblLike);
							}
						});
						
						JButton btnDislike = new JButton("");
						btnDislike.setIcon(new ImageIcon(inicio.class.getResource("/Imagenes/dislike.jpg")));
						btnDislike.setBounds(308, 458, 67, 40);
						panel.add(btnDislike);
						
						btnDislike.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int votos = 0;
								votos = votos + 1;
								
								JLabel lbDislike = new JLabel(Integer.toString(votos));
								lbDislike.setBounds(342, 500, 17, 22);
								panel.add(lbDislike);
							}
						});
			
				    }
				   
			}
		});
	}
}
