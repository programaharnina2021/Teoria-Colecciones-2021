package conjuntos;

import java.awt.dnd.DnDConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class setUno {
	public static void main(String[] args) {
		//Sin repeticiones y ordenado
		//ordena por compareTo
		TreeSet<String> palabras=new TreeSet<String>();
		String palabrica=new String("columna");
		System.out.println(palabras.add("columna"));
		System.out.println(palabras.add("zalamero"));
		System.out.println(palabras.add("fila"));
		System.out.println("== "+("columna"==palabrica));
		System.out.println("equals "+("columna".equals(palabrica)));
		System.out.println(palabras.add(palabrica));
		System.out.println(palabras);
		ArrayList<String> lista=new ArrayList<>();
		
		//Si intentamos crear un treeset de elementos sin la implementacion de comparable
		//da error
//		TreeSet<Persona> elementoSet=new TreeSet<Persona>();
//		elementoSet.add(new Persona());
		//Solucion
		TreeSet<Persona> elementoSet=new TreeSet<Persona>(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.dniString.compareTo(o2.dniString);
			}
		});
		elementoSet.add(new Persona("34","Rigoberto"));
		elementoSet.add(new Persona("33","Rigoberto"));
		elementoSet.add(new Persona("33","Rigoberto"));
		elementoSet.add(new Persona("31","Rigoberto"));
		System.out.println(elementoSet);
		
	}

}
