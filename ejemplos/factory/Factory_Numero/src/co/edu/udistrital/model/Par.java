package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Numero;



public class Par extends Numero {

	public Par(int numero) {
		super(numero);
	}

	@Override
	public String describir() {
		return "....... EL NUMERO ES PAR......";
	}


}
