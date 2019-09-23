package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
	
	private Vista vista;
	private Modelo modelo;
	
	
	
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public void setVista(Vista vista) {
		this.vista = vista;
	}
	public void solicitudTraduccion() {
		modelo.traducir(vista.getTexto().toUpperCase());
	}

}
