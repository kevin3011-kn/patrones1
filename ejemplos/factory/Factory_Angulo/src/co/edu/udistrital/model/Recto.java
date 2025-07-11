package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Angulo;

public class Recto extends Angulo {

	public Recto(int angulo) {
		super(angulo);
	}

	@Override
	public String describir() {
		return ".......ANGULO RECTO......";
	}


}
