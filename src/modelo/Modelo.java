package modelo;

import controlador.Controlador;
import vista.Vista;

public class Modelo {

	private Controlador controlador;
	private Vista vista;

	private String morse;

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}

	public String getMorse() {
		return morse;
	}

	public void traducir(String texto) {
		morse = "";
		String letra;
		for (int i = 0; i < texto.length(); i++) {
			letra = texto.substring(i, i + 1);
			calcularLetra(letra);
		}

		vista.actualizarMorse();
	}

	private void calcularLetra(String letra) {
		switch (letra) {
		case "A":
			morse += ".-";
			break;
		case "B":
			morse += "-...";
			break;
		case "C":
			morse += "-.-.";
			break;
		case "D":
			morse += "-..";
			break;
		case "E":
			morse += ".";
			break;
		case "F":
			morse += "..-.";
			break;
		case "G":
			morse += "--.";
			break;
		case "H":
			morse += "....";
			break;
		case "I":
			morse += "..";
			break;
		case "J":
			morse += ".---";
			break;
		case "K":
			morse += "-.-";
			break;
		case "L":
			morse += ".-..";
			break;
		case "M":
			morse += "--";
			break;
		case "N":
			morse += "-.";
			break;
		case "O":
			morse += "---";
			break;
		case "P":
			morse += ".--.";
			break;
		case "Q":
			morse += "--.-";
			break;
		case "R":
			morse += ".-.";
			break;
		case "S":
			morse += "...";
			break;
		case "T":
			morse += "-";
			break;
		case "U":
			morse += "..-";
			break;
		case "V":
			morse += "...-";
			break;
		case "W":
			morse += ".--";
			break;
		case "X":
			morse += "-..-";
			break;
		case "Y":
			morse += "-.--";
			break;
		case "Z":
			morse += "--..";
			break;
		default:
			morse += "  ";
			break;
		}
		
		morse += " ";
	}

}
