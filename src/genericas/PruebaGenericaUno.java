package genericas;

public class PruebaGenericaUno {

	public static void main(String[] args) {
		GenericaUno<String> miNumericaUno=new GenericaUno<String>("Luis");
		GenericaUno<StringBuilder> miNumericaDos=new GenericaUno<StringBuilder>(new StringBuilder("Hola"));
		System.out.println(miNumericaUno.getMipropiedad().getClass());
		System.out.println(miNumericaDos.getMipropiedad().getClass());
//		GenericaUno<int> lola;
		GenericaUno<Integer> lola;
//		GenericaUno<56> lola;
//		GenericaUno<float> lola;
		//wrapper
		GenericaUno<Float> lolas;
	}

}
