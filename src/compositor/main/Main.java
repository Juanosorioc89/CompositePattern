package compositor.main;

import compositor.base.AbstractCompositor;
import compositor.componentes.*;

public class Main {

	public static void main(String[] args) {
		
		AbstractCompositor componenteUno = new Hoja(10);
		
		System.out.println(componenteUno.getCosto());
		
		AbstractCompositor componenteTres = new Hoja(3);
		AbstractCompositor componenteDos = new Libro();
		
		componenteDos.agregarHoja(componenteUno);
		componenteDos.agregarHoja(componenteTres);
		
		System.out.println(componenteDos.getCosto());

	}

}
