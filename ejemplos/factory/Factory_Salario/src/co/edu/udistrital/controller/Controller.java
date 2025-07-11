package co.edu.udistrital.controller;

import co.edu.udistrital.model.abstracto.*;
import co.edu.udistrital.model.concretoCreador.*;
import co.edu.udistrital.view.VistaConsola;

public class Controller {

	private VistaConsola vista;
	
    public Controller() {
    	vista = new VistaConsola();
	}
    
    public void run() {
    	int a = 0;
    
    	
        vista.mostrarInformacion("INGRESE EL SALARIO");
        
        a = vista.leerDatoEntero("\t" + "Digite el valor: ");
  
        
       SalarioFactory fabrica=new SalarioCreador();
        
        Salario salario = fabrica.crearSalario(a);
        
        vista.mostrarInformacion("ELO SALARIO ES DE ....." + salario.describir() );
        vista.mostrarInformacion("EL AUMENTO ESs....." + salario.calcularAumento());
    }
    
}
