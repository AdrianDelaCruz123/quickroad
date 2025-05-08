package main;

import controladores.ControlerLogin;
import vistas.VistaLogin;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				repositorios.ConectorBD.conectar();
		        //Cargamos la vista
		        VistaLogin vista = new VistaLogin();
		        //Le pasamos la vista al controlador
		        ControlerLogin controlador = new ControlerLogin(vista);
		        //El controlador manejara el boton cuando le demos a registrar.
		        
		        //Iniciamos la vista.
		        controlador.iniciar();
		      
	 }


}
