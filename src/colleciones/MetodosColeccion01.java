package colleciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MetodosColeccion01 {
	public static void main(String[] args) {
		//ESto no se puede hacer. si sabes el tipo, lo pones
		Collection<Integer> miLista=new ArrayList<Integer>();
		miLista.add(6);
		miLista.add(7);
		miLista.add(8);
		miLista.add(9);
		miLista.add(10);
//		miLista.get(0);
		ArrayList<Integer> miOtraLista=new ArrayList<Integer>();
		miOtraLista.add(1);
		miOtraLista.add(2);
		miOtraLista.add(3);
		miOtraLista.add(4);
		miOtraLista.add(5);
		List cosa=FactoriaColecciones.factoryMethod();
		//Cosas que podemos hacer con las lista
		//recorrerla
		for (Integer numero : miOtraLista) {
			System.out.println(numero);
		}
		//De golpe
		miOtraLista.addAll(miLista);
		System.out.println(miOtraLista);
		System.out.println("mi lista");
		System.out.println(miLista);
		for (int i = 0; i < miOtraLista.size(); i++) {
			System.out.println(miOtraLista.get(i));
		}
		ArrayList<Integer> fusionArrayList=new ArrayList<Integer>();
		miOtraLista.set(3, 11);
		System.out.println(miOtraLista);
//		System.out.println(fusionArrayList.set(4, 11));
//		System.out.println(fusionArrayList);
		miOtraLista.add(5, 12);
		System.out.println(miOtraLista);
	}
}
