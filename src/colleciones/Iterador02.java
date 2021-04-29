package colleciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterador02 {
	public static void main(String[] args) {
		ArrayList miLista = new ArrayList();
		miLista.add(4);
		miLista.add(9);
		System.out.println("donde esta el nueve? " + miLista.indexOf(9));
		System.out.println("esta el nueve? " + miLista.contains(9));
		// ESto da un error cuando queremos recorrer y borrar usando la lista
		for (Object object : miLista) {
			if (object.equals(9)) {
				miLista.remove(object);
			}
			System.out.println(miLista);
		}
		//Como sacar el iterador a mano
		Iterator iterator2 = miLista.iterator();
		while(iterator2.hasNext()) {
			Object next = iterator2.next();
//			iterator2.remove();
		}
			// ESta interface permite borrar mientras se recorre
		for (Iterator iterator = miLista.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object.equals(9))
				iterator.remove();
			System.out.println(miLista);
		}
		//es un iterator con algo mas
			ListIterator listIterator = miLista.listIterator();
			listIterator.hasNext();
			listIterator.nextIndex();
			listIterator.hasPrevious();
			listIterator.next();
			listIterator.previous();		
	}
}
