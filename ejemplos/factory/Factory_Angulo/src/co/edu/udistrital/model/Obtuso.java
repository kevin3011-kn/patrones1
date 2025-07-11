package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Angulo;

public class Obtuso extends Angulo {

	public Obtuso(int angulo) {
		super(angulo);
	}

	@Override
	public String describir() {
		return ".....ANGULO OBTUSO.....";
	}

	
}
