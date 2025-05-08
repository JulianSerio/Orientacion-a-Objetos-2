package ar.edu.unlp.objetos.oo2.ejercicio11_topografias;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Mixta extends AbstractList<Topografia> implements Topografia {
	private List<Topografia> topografias = new ArrayList<Topografia>(4);
	
	public Mixta(Topografia t1,Topografia t2,Topografia t3,Topografia t4) {
		topografias.add(t1);
		topografias.add(t2);
		topografias.add(t3);
		topografias.add(t4);
	}
	
	@Override
	public int size() {
		return this.topografias.size();
	}

	@Override
	public double proporcionAgua() {
		return topografias.stream()
				.mapToDouble(Topografia::proporcionAgua)
				.sum() / 4;
	}

	@Override
	public double proporcionTierra() {
		return topografias.stream()
				.mapToDouble(Topografia::proporcionTierra)
				.sum() / 4;
	} 

	@Override
	public Topografia get(int index) {
		return this.topografias.get(index);
	}

}
