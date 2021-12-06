package comunicacion;

public class Alfabeto extends Pictograma {
	public Alfabeto(String[] letras, String interpretacion) {
		super();
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	private String[] letras;
	private String interpretacion;
	
	public int cantidadLetras() {
		return letras.length;
	}
	public String interpretacion() {return interpretacion;}
	public String toString() {
		String retorno = "";
		for(int i = 0; i < letras.length; i++) {
			retorno += letras[i] + ", ";
		}
		return retorno;
	}
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
