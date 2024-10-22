package compositor.componentes;

import compositor.base.AbstractCompositor;

public class Hoja extends AbstractCompositor {
	
	private int costo;
	public Hoja(int costo) {
		this.costo = costo;
	}
	@Override
	public int getCosto() {
		return this.costo;
	}
	@Override
	public void agregarHoja(AbstractCompositor composicion) {
		// no se usa
		
	}

}
