package main;

import controladores.ControlerLogin;
import vistas.VistaLogin;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				repositorios.ConectorBD.conectar();
				
		        VistaLogin vista = new VistaLogin();
		        
		        ControlerLogin controlador = new ControlerLogin(vista);
		        
		        controlador.iniciar();
		      
	 }


}
