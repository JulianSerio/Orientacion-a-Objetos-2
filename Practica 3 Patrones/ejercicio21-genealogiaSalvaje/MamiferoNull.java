package ar.edu.unlp.objetos.oo2.ejercicio21_genealogiaSalvaje;

public class MamiferoNull extends Mamifero {

    private static final MamiferoNull INSTANCIA = new MamiferoNull();

    private MamiferoNull() {
        super("NULO");
    }

    public static MamiferoNull getInstancia() {
        return INSTANCIA;
    }

    @Override
    public Mamifero getPadre() {
        return this;
    }

    @Override
    public Mamifero getMadre() {
        return this;
    }

    @Override
    public Mamifero getAbuelaMaterna() {
        return this;
    }

    @Override
    public Mamifero getAbueloMaterno() {
        return this;
    }

    @Override
    public Mamifero getAbuelaPaterna() {
        return this;
    }

    @Override
    public Mamifero getAbueloPaterno() {
        return this;
    }

    @Override
    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        return false;
    }
}

