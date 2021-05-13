package conjuntos;

public class Persona {
 public String dniString;
 public String nombString;
 
 
 public Persona(String dniString, String nombString) {
	super();
	this.dniString = dniString;
	this.nombString = nombString;
}


@Override
	public boolean equals(Object obj) {
		return this.dniString.equals(((Persona)obj).dniString);
	}
@Override
	public String toString() {
		return dniString;
	}
}
