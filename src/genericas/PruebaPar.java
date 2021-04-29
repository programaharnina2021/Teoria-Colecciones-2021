package genericas;

public class PruebaPar {
	public static void main(String[] args) {
		Par<Integer, String> miPar=new Par<Integer, String>(1, "Lautaro");
		Par<Identificador, Persona> miOtroPar=new Par<Identificador, Persona>(new Identificador(),new Persona());
	}
}
