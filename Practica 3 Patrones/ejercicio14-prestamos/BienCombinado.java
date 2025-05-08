package ar.edu.unlp.objetos.oo2.ejercicio14_prestamos;

import java.util.List;

public class BienCombinado extends Bien {
	private List<Bien> bienes;

	public BienCombinado(List<Bien> bienes) {
		this.setLiquidez(0.5);
		this.bienes = bienes;
	}

	@Override
	protected double calcularValor() {
		return this.bienes.stream()
				.mapToDouble(b -> b.calcularValor())
				.sum();
	}

}
