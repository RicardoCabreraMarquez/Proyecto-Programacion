package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import beans.Usuario;
import controlador.ControladorUsuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class añadirAmigos extends JFrame {

	private JTable table; 


	private JPanel contentPane;
	private JTextField textNombreUsuario;
	private JTextField textField;

	
	public añadirAmigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(34, 24, 817, 596);
		contentPane.add(panel);
		panel.setLayout(null);
		
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);
		table.setBounds(41, 125, 349, 407);
		panel.add(table);
        dtm.addColumn("NOMBREUSUARIO");
		
		JLabel lblNewLabel_1 = new JLabel("Usuarios de Digicupid :");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(43, 45, 372, 43);
		panel.add(lblNewLabel_1);
		
		JButton btnRefrescar = new JButton("Refrescar");
		btnRefrescar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRefrescar.setForeground(Color.RED);
		btnRefrescar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Usuario> usuarios = new ControladorUsuario().refrescartodosUsuarios();
                dtm.getDataVector().removeAllElements();
                dtm.fireTableDataChanged();

                // Montar los datos recogidos en la tabla
                
                for(Usuario usuario : usuarios){
                    Object[] fila = new Object[1];
                    fila[0] = "@"+usuario.getNombreUsuario();
           

                    dtm.addRow(fila);
                }
			}
		});
		btnRefrescar.setBounds(527, 178, 165, 49);
		panel.add(btnRefrescar);
		
		JLabel lblNombreUsuario = new JLabel("Nombre Usuario");
		lblNombreUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombreUsuario.setBounds(154, 100, 118, 14);
		panel.add(lblNombreUsuario);
		
		JButton btnBorrarUsuario = new JButton("Borrar Usuario");
		btnBorrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nombreUsuario = (textNombreUsuario.getText());
                    new ControladorUsuario().borrarUsuario(nombreUsuario);

                } catch(Exception error) {
                    JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
                    return;
                }
			}
		});
		btnBorrarUsuario.setForeground(Color.RED);
		btnBorrarUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBorrarUsuario.setBounds(527, 302, 165, 49);
		panel.add(btnBorrarUsuario);
		
		textNombreUsuario = new JTextField();
		textNombreUsuario.setBounds(527, 271, 165, 20);
		panel.add(textNombreUsuario);
		textNombreUsuario.setColumns(10);
		
		
		
		JButton btnModificarNombre = new JButton("Modificar Nombre");
		btnModificarNombre.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				  try {
	                   Usuario usuario = crearUsuarioDesdeFormulario();
	                    new ControladorUsuario().modificarUsuario(usuario);
	                } catch(Exception error) {
	                    JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
	                    return;
	                } 
			}
		}); 
		btnModificarNombre.setForeground(Color.RED);
		btnModificarNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnModificarNombre.setBounds(527, 413, 165, 49);
		panel.add(btnModificarNombre);
		
		textField = new JTextField();
		textField.setBounds(527, 383, 165, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(añadirAmigos.class.getResource("/Imagenes/Fondo.jpg")));
		lblNewLabel.setBounds(0, 0, 884, 661);
		contentPane.add(lblNewLabel);
		
		
	}
	
	private Usuario crearUsuarioDesdeFormulario() {
        String nombreUsuario = textNombreUsuario.getText();

        Usuario usuario = new Usuario(nombreUsuario);
        return usuario;
	}
}
