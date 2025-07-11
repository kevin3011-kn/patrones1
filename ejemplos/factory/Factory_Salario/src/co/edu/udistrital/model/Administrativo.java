package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Salario;


public class Administrativo extends Salario {

	public Administrativo(int numero) {
		super(numero);
	}

	@Override
	public String describir() {
		return "....... ADMINISTRATIVO......";
	}

	@Override
	public String calcularAumento() {
		int x;
		String res;
		x = (int) (salario*(0.10));
		res = Integer.toString(x);
		return res;
	}

	
}
