package modelo;

import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Usuario;

public class ModeloUsuario {
	
	public void insertarUsuario(Usuario usuario) {
		String nombre = usuario.getNombre();
		String correoElectronico = usuario.getCorreoElectronico();
		String nombreUsuario = usuario.getNombreUsuario();
		String contraseña = usuario.getContraseña();
		
		Conexion.ejecutarUpdate(
				"INSERT INTO usuario (NOMBRE, CORREOELECTRONICO, NOMBREUSUARIO, CONTRASEÑA)"+
				" VALUES ('"+nombre+"', '"+correoElectronico+"','"+nombreUsuario+"', '"+contraseña+"');"
				);
	}
	
	
	public static ArrayList<Usuario> refrescarUsuarios(){

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ResultSet resultado = Conexion.ejecutarSentencia("SELECT NOMBREUSUARIO FROM usuario;");

        try {
            while(resultado.next()) {
                String nombre = resultado.getString("NOMBREUSUARIO");
                usuarios.add(new Usuario(nombre));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
	
	public void borrarUsuario(String nombreUsuario) {
        Conexion.ejecutarUpdate("DELETE FROM USUARIO WHERE NOMBREUSUARIO='"+nombreUsuario+"';");
    }
	
	public void modificarUsuario(Usuario usuario) {
		String nombreUsuario = usuario.getNombreUsuario();
		String nombre = usuario.getNombre();
 
        Conexion.ejecutarUpdate("UPDATE USUARIO SET NOMBREUSUARIO='"+nombreUsuario+"' WHERE NOMBRE = '"+nombre+"';");
    }	
	
	public void crearFichero(String nombreUsuario, String contraseña) {
		FileWriter fichero = null;
		
		try {
            fichero = new FileWriter(nombreUsuario+".txt");
            
            fichero.write("Username: " + nombreUsuario + "\nContrasena: " + contraseña);
            fichero.close();

        } catch (Exception e) {
            System.out.println(e);
        }
	}
	
}
