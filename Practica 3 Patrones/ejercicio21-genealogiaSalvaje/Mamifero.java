package ar.edu.unlp.objetos.oo2.ejercicio21_genealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero {
	
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre = MamiferoNull.getInstancia();
	private Mamifero padre = MamiferoNull.getInstancia();
	
	public Mamifero (String identificador) {
		this.identificador = identificador;
	}
	
	public Mamifero () {
		
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String id) {
		this.identificador = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public java.time.LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(java.time.LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}

	public Mamifero getMadre() {
		return this.madre;
	}

	 public void setMadre(Mamifero madre) {
		 if (madre == null) {
			 this.madre = MamiferoNull.getInstancia();
	     } else {
	    	 this.madre = madre;
	     }
	 }

	public Mamifero getPadre() {
		return this.padre;
	}

	public void setPadre(Mamifero padre) {
		if (padre == null) {
			this.padre = MamiferoNull.getInstancia();
        } 
		else {
            this.padre = padre;
        }
    }
	
	public Mamifero getAbuelaMaterna() {
        return this.getMadre().getMadre();
    }

    public Mamifero getAbueloMaterno() {
        return this.getMadre().getPadre();
    }

    public Mamifero getAbuelaPaterna() {
        return this.getPadre().getMadre();
    }

    public Mamifero getAbueloPaterno() {
        return this.getPadre().getPadre();
    }
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return (tieneAncestro(this.getMadre(),unMamifero) || tieneAncestro(this.getPadre(),unMamifero));
	}
	
	private boolean tieneAncestro (Mamifero parent, Mamifero unMamifero) {
		return (unMamifero.equals(parent) || parent.tieneComoAncestroA(unMamifero));
	}
}