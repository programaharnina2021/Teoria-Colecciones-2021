package colleciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparandoClases05 {

	public static void main(String[] args) {
		ArrayList<PersonaDos> listado = new ArrayList<PersonaDos>();
		listado.add(new PersonaDos("Luis", 12));
		listado.add(new PersonaDos("Esteban", 18));
		listado.add(new PersonaDos("Arturo", 14));
		listado.add(new PersonaDos("Roberto", 19));
		PersonaDos uno=new PersonaDos("tiburcio", 23);
		PersonaDos dos=new PersonaDos("edelmiro", 12);
		PersonaDos person = new PersonaDos("Benito", 12);
		uno.compareTo(dos);
		System.out.println(listado);
		Collections.sort(listado);
		listado.add(person);
		System.out.println(listado);
		Collections.sort(listado);
		System.out.println(listado);
	}

}
