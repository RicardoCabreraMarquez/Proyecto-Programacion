package main;

import bbdd.Conexion;
import vista.login;

public class Main {

	public static void main(String[] args) {
	
	// Conectar con la BBDD
		Conexion.conectar();
		
   // Abrir ventana principal
		new login();
	}

}
