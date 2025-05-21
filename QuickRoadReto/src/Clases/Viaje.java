package Clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Viaje {
    private String id;
    private String origen;
    private String destino;
    private String fechaSalida;
    private String fechaLlegada;
    private String estado;

    public Viaje(String id, String origen, String destino, String fechaSalida, String fechaLlegada, String estado) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.estado = estado;
    }
    
    

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fecha) {
		this.fechaSalida = fecha;
	}
	public String getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(String fecha) {
		this.fechaLlegada = fecha;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	@Override
    public String toString() {
        return id + " | " + origen + " → " + destino + " | " + estado;
    }
	
	public boolean esViajeFinalizado() {
	    return "Finalizado".equalsIgnoreCase(estado);
	}
	public boolean esViajeEnCurso() {
	    return "En_transito".equalsIgnoreCase(estado);
	}
	public void iniciarViaje() {
	    this.estado = "En_transito";
	}
	public void finalizarViaje() {
	    this.estado = "Finalizado";
	}



}
