package ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private State estado;
	private List<Usuario> inscriptos;
	private List<Usuario> espera;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,int cupoMin, int cupoMax) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.inscriptos = new ArrayList<Usuario>();
		this.espera = new ArrayList<Usuario>();
		this.estado = new Provisoria();
	}
	
	public void setEstado(State estado) {
		this.estado = estado;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}
	
	public List<Usuario> getEspera() {
		return this.espera;
	}
	
	public int getCupoMin() {
		return cupoMin;
	}

	public int getCupoMax() {
		return cupoMax;
	}
	
	public void inscribir(Usuario user) {
		estado.inscribir(this, user);
	}
	
	public void agregarAInscriptos(Usuario user) {
		this.inscriptos.add(user);
	}
	
	public void agregarAEspera(Usuario user) {
		this.espera.add(user);
	}
	
	public String obtenerEmails() {
		String emails = "";
		for (Usuario user : inscriptos) {
			emails += user.getEmail() + " ";
		}
		return emails;
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion(this);
	}
	
	@Override
	public String toString() {
		return "Excursion nombre= " + nombre + ", costo= " + costo + ", fechaInicio= " + fechaInicio.toString() + ", fechaFin= " + fechaFin.toString() + ", puntoEncuentro= " + puntoEncuentro + ", ";
	}

	
	
	

}
