package modelo;

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
		String contrase�a = usuario.getContrase�a();
		
		Conexion.ejecutarUpdate(
				"INSERT INTO usuario (NOMBRE, CORREOELECTRONICO, NOMBREUSUARIO, CONTRASE�A)"+
				" VALUES ('"+nombre+"', '"+correoElectronico+"','"+nombreUsuario+"', '"+contrase�a+"');"
				);
	}
	
	
	public static ArrayList<Usuario> refrescarUsuarios(){

        ArrayList<Usuario> productos = new ArrayList<Usuario>();
        ResultSet resultado = Conexion.ejecutarSentencia("SELECT NOMBREUSUARIO FROM usuario;");

        try {
            while(resultado.next()) {
                String nombre = resultado.getString("NOMBREUSUARIO");
                productos.add(new Usuario(nombre));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }
	
	public void borrarProducto(String nombreUsuario) {
        Conexion.ejecutarUpdate("DELETE FROM NOMBREUSUARIO WHERE id_prod="+nombreUsuario+";");
    }
	
}