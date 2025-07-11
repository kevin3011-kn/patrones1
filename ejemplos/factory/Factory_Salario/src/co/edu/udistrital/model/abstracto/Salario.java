package co.edu.udistrital.model.abstracto;

public abstract class Salario {

	protected int salario;
	

	public Salario(int salario) {
		this.salario = salario;
	
	}

	public abstract String describir();

	public abstract String calcularAumento();

}
