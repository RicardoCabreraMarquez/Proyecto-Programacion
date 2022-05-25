package beans;

public class Usuario {
	
	String nombre;
	String correoElectronico;
	String nombreUsuario;
	String foto;
	String contrase�a;
	
	private Usuario() {}

	
	public Usuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}



	public Usuario(String nombre, String correoElectronico, String nombreUsuario, String contrase�a) {
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.nombreUsuario = nombreUsuario;
		this.contrase�a = contrase�a;
	}


	private Usuario(String nombre, String correoElectronico, String nombreUsuario, String foto, String contrase�a) {
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.nombreUsuario = nombreUsuario;
		this.contrase�a = contrase�a;
		this.foto = foto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", nombreUsuario="
				+ nombreUsuario + ", foto=" + foto + ", contrase�a=" + contrase�a + "]";
	}
	
}