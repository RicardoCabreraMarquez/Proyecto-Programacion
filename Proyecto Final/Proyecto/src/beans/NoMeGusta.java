package beans;

public class NoMeGusta {

	String usuario1;
	String usuario2;
	String fecha;
	
	public NoMeGusta() {}

	public NoMeGusta(String usuario1, String usuario2, String fecha) {
		this.usuario1 = usuario1;
		this.usuario2 = usuario2;
		this.fecha = fecha;
	}

	public String getUsuario1() {
		return usuario1;
	}

	public void setUsuario1(String usuario1) {
		this.usuario1 = usuario1;
	}

	public String getUsuario2() {
		return usuario2;
	}

	public void setUsuario2(String usuario2) {
		this.usuario2 = usuario2;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "NoMeGusta [usuario1=" + usuario1 + ", usuario2=" + usuario2 + ", fecha=" + fecha + "]";
	}
}
