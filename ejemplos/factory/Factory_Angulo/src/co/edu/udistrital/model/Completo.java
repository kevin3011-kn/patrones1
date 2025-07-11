package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Angulo;

public class Completo extends Angulo {

	public Completo(int angulo) {
		super(angulo);
	}

	@Override
	public String describir() {
		return ".......ANGULO COMPLETO......";
	}


}
