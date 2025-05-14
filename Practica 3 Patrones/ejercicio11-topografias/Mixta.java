package ar.edu.unlp.objetos.oo2.ejercicio11_topografias;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Mixta implements Topografia {
	private List<Topografia> topografias = new ArrayList<Topografia>(4);
	
	public Mixta(Topografia t1,Topografia t2,Topografia t3,Topografia t4) {
		topografias.add(t1);
		topografias.add(t2);
		topografias.add(t3);
		topografias.add(t4);
	}


	@Override
	public double proporcionAgua() {
		return topografias.stream()
				.mapToDouble(t -> t.proporcionAgua())
				.sum() / 4;
	}

	@Override
	public double proporcionTierra() {
		return topografias.stream()
				.mapToDouble(t -> t.proporcionTierra())
				.sum() / 4;
	} 


	@Override
	public boolean igual(Topografia topo) {
		int count = 0;
	    if (topo.igualAMixta()) {
	    	for (int i = 0; i < this.topografias.size(); i++) {
	    		if (this.topografias.get(i).igual(topo.obtenerTopografia(i))) {
	    			count++;
	    		}
	        }
	    }
	    if (count == this.topografias.size()) return true;
	    else return false;
	  
	}

	@Override
	public Topografia obtenerTopografia(int i) {
		return this.topografias.get(i);
	}

	@Override
	public boolean igualAAgua() {
		return false;
	}

	@Override
	public boolean igualATierra() {
		return false;
	}

	@Override
	public boolean igualAPantano() {
		return false;
	}

	@Override
	public boolean igualAMixta() {
		return true;
	}
}
