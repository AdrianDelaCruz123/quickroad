package Clases;

public class Usuario {
 
	private String nombre;
	private String dni;
	private int telefono;
    private String direccion;
    private String contraseña;
    public String tipo;
    public String estado;

	
	public Usuario(String nombre, String dni, int telefono, String direccion, String contraseña, String tipo, String estado) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
		this.contraseña = contraseña;
		this.tipo = tipo;
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
	    return "👤 Usuario\n"
	         + "  • Nombre: " + nombre + "\n"
	         + "  • DNI: " + dni + "\n"
	         + "  • Teléfono: " + telefono + "\n"
	         + "  • Dirección: " + direccion + "\n"
	         + "  • Tipo de usuario: " + tipo + "\n"
	         + "  • Estado: " + estado;
	}

	
    
	
}
