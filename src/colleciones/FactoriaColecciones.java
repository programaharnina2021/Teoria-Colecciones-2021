package colleciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FactoriaColecciones {
	public static List factoryMethod() {
		// hace un sorteo entre uno y dos
		int sorteo = 1;
		if (sorteo == 1) {
			return new ArrayList();
		}
		if (sorteo == 2) {
			return new LinkedList();
		}
		return null;
	}
}
