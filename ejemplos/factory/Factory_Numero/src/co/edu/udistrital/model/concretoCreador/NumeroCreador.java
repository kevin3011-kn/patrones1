package co.edu.udistrital.model.concretoCreador;

import co.edu.udistrital.model.*;
import co.edu.udistrital.model.abstracto.Numero;
import co.edu.udistrital.model.abstracto.NumeroFactory;


public class NumeroCreador implements NumeroFactory {


	@Override
	public Numero crearNumero(int numero) { 
		
		if(numero%2==0) {
			
		return new Par(numero);
	  }else {
		  return new Impar(numero);
	  }

}
	
	
}	
