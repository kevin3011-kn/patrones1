package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Numero;


public class Impar extends Numero {

	public Impar(int numero) {
		super(numero);
	}

	@Override
	public String describir() {
		return ".....EL NUMERO ES IMPAR.....";
	}


}
