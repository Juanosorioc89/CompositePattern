package compositor.componentes;

import java.util.ArrayList;
import java.util.List;

import compositor.base.AbstractCompositor;

public class Libro extends AbstractCompositor{
	
	private int costo = 0;
	
	private List<AbstractCompositor> listaComposicion;
	
	
	public Libro() {
		
		listaComposicion = new ArrayList<AbstractCompositor>();
	}

	@Override
	public int getCosto() {
		return this.costo;
	}

	@Override
	public void agregarHoja(AbstractCompositor composicion) {
		this.costo = this.costo + composicion.getCosto();
		this.listaComposicion.add(composicion);
	}

}
