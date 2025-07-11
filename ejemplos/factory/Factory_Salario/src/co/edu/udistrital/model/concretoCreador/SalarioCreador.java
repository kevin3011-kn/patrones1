package co.edu.udistrital.model.concretoCreador;

import co.edu.udistrital.model.*;
import co.edu.udistrital.model.abstracto.Salario;
import co.edu.udistrital.model.abstracto.SalarioFactory;


public class SalarioCreador implements SalarioFactory {

	
	@Override
	public Salario crearSalario(int salario) {
		if(salario<=1000000) {
			return new Obrero(salario);
		}
		if((salario>1000000) && (salario<2000000)) {
			return new Obrero(salario);
		}else{
			return new AltoMando(salario);
		}
	}

}
