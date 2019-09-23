package controlador;

import modelo.Modelo;
import vista.Vista;

public class Main {

	public static void main(String[] args) {
		
		Controlador controlador = new Controlador();
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		
		controlador.setModelo(modelo);
		controlador.setVista(vista);
		
		modelo.setControlador(controlador);
		modelo.setVista(vista);
		
		vista.setControlador(controlador);
		vista.setModelo(modelo);
		
		vista.setVisible(true);
	}

}
