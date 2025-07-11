package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Salario;


public class Obrero extends Salario {

	public Obrero(int numero) {
		super(numero);
	}

	@Override
	public String describir() {
		return "....... OBRERO......";
	}

	public String calcularAumento() {
		int x;
		String res;
		x = (int) (salario*(0.5));
		res = Integer.toString(x);
		return res;
	}

	
}
