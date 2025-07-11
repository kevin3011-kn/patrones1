package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Angulo;


public class Agudo extends Angulo {

	public Agudo(int angulo) {
		super(angulo);
	}

	@Override
	public String describir() {
		return "....... ANGULO AGUDO......";
	}

}
