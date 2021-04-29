package genericas;

public class GenericaUno<T> {
	private T mipropiedad;

	public GenericaUno(T mipropiedad) {
		super();
		this.mipropiedad = mipropiedad;
	}

	public T getMipropiedad() {
		return mipropiedad;
	}

	public void setMipropiedad(T mipropiedad) {
		this.mipropiedad = mipropiedad;
	}
	
}
