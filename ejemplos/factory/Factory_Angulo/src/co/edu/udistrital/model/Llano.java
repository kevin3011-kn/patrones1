package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Angulo;

public class Llano extends Angulo {

	public Llano(int angulo) {
		super(angulo);
	}

	@Override
	public String describir() {
		return ".......ANGULO LLANO......";
	}


}
