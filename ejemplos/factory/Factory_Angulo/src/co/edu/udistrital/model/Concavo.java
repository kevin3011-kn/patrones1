package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Angulo;

public class Concavo extends Angulo {

	public Concavo(int angulo) {
		super(angulo);
	}

	@Override
	public String describir() {
		return ".......ANGULO CONCAVO......";
	}


}
