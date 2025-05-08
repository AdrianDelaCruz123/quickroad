package Clases;

public class Paquete {
	private int idPaquete;
	private String decripcion;
	private double peso;
	private double alto;
	private double ancho;
	private String fecharecogida;
	private String fechaEntrega;
	private String estado;
	
	
	public Paquete(int idPaquete, String decripcion, double peso,
			double alto, double ancho, String fecharecogida, String fechaEntrega, String estado) {
		super();
		this.idPaquete = idPaquete;

		this.decripcion = decripcion;
		this.peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.fecharecogida = fecharecogida;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
	}
	
	
	public int getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(int idPaquete) {
		this.idPaquete = idPaquete;
	}

	public String getDecripcion() {
		return decripcion;
	}
	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public String getFecharecogida() {
		return fecharecogida;
	}
	public void setFecharecogida(String fecharecogida) {
		this.fecharecogida = fecharecogida;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
