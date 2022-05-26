package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.Usuario;
import modelo.ModeloUsuario;

public class ControladorUsuario {
	
	public void crearUsuario(Usuario usuario) {
		new ModeloUsuario().insertarUsuario(usuario);
		JOptionPane.showMessageDialog(null, "El usuario "+usuario.getNombreUsuario()+" se ha registrado correctamente");
	}
	
	public ArrayList<Usuario> refrescartodosUsuarios() {
        ArrayList<Usuario> usuarios = new ModeloUsuario().refrescarUsuarios();
        return usuarios;
    }
	
	public void borrarUsuario(String nombreUsuario) {
        new ModeloUsuario().borrarUsuario(nombreUsuario);
        JOptionPane.showMessageDialog(null, "¡Has borrado correctamente el Usuario!");
    }
	
	public void modificarUsuario(Usuario usuario) {
        new ModeloUsuario().modificarUsuario(usuario);
        JOptionPane.showMessageDialog(null, "¡Has modificado el usuario!");
    }
	
	public void crearFicheroUsuario(String nombreUsuario, String contraseña) {
		new ModeloUsuario().crearFichero(nombreUsuario, contraseña);
	}
}
