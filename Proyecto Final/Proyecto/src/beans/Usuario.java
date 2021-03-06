package beans;

public class Usuario {
	
	String nombre;
	String correoElectronico;
	String nombreUsuario;
	String foto;
	String contraseña;
	
	private Usuario() {}

	
	public Usuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Usuario(String nombreUsuario, String contraseña) {
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
	}


	public Usuario(String nombre, String correoElectronico, String nombreUsuario, String contraseña) {
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
	}


	private Usuario(String nombre, String correoElectronico, String nombreUsuario, String foto, String contraseña) {
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", nombreUsuario="
				+ nombreUsuario + ", foto=" + foto + ", contraseña=" + contraseña + "]";
	}
	
}
