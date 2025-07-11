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
    	
    	
        vista.mostrarInformacion("DIGITE EL VALOR DEL ANGULO");
        
        a = vista.leerDatoEntero("\t" + "Digite el angulo:  ");
       
        
        AnguloFactory fabrica=new AnguloCreador();
        
        Angulo angulo = fabrica.crearAngulo(a);
        
        vista.mostrarInformacion("ESTE TRIANGULO ES DE TIPO....." + angulo.describir() );
       
    }
    
}
