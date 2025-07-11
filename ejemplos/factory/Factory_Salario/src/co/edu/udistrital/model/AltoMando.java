package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Salario;

public class AltoMando extends Salario {

	public AltoMando(int numero) {
		super(numero);
	}

	@Override
	public String describir() {
		return "....... ALTO MANDO......";
	}

	@Override
	public String calcularAumento() {
		int x;
		String res;
		x = (int) (salario*(0.15));
		res = Integer.toString(x);
		return res;
	}

	
}
