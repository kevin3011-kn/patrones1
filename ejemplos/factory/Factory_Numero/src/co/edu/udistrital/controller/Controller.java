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
    	
    	
        vista.mostrarInformacion("INGERESE EL NUMERO A VERIFICAR");
        
        a = vista.leerDatoEntero("\t" + "Digite valor: ");
        
        
        NumeroFactory fabrica=new NumeroCreador();
        
        Numero num = fabrica.crearNumero(a);
        
        vista.mostrarInformacion("ESTE NUMERO ES DE TIPO....." + num.describir() );
       
    
}
}