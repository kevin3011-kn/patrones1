package co.edu.udistrital.model.concretoCreador;

import co.edu.udistrital.model.*;

import co.edu.udistrital.model.abstracto.Angulo;
import co.edu.udistrital.model.abstracto.AnguloFactory;


public class AnguloCreador implements AnguloFactory {


	@Override
	public Angulo crearAngulo(int anguloA) {
		int angulo = 90;
		int angulo1 = 180;
		int angulo2 = 360;
		
		if (anguloA < angulo) {
			return new Agudo(anguloA);
		}
		if (anguloA == angulo) {
			return new Recto(anguloA);
		}
		if ((anguloA > angulo) && (anguloA<angulo1)) {
			return new Obtuso(anguloA);
		}
		if (anguloA == angulo1) {
			return new Llano(anguloA);
		}
		if ((anguloA > angulo1) && (anguloA<angulo2)) {
			return new Concavo(anguloA);
		}
		if (anguloA == angulo2) {
			return new Completo(anguloA);
		}
		return null;
	}

}
