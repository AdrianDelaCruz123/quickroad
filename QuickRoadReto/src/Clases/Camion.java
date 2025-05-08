package Clases;

public class Camion {
	private String matricula;
	private String modelo;
	private String marca;
	private String año;
	private Double capacidad;
	private String estado;
	
	public Camion(String matricula, String modelo, String marca, String año, Double capacidad, String estado) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.año = año;
		this.capacidad = capacidad;
		this.estado = estado;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public Double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Camion matricula=" + matricula + ", modelo=" + modelo;
	}
	
	
}
