package comunicacion;

public class Alfabeto extends Pictograma {
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
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
		for(int i = 0; i < letras.length - 1; i++) {
			retorno += letras[i] + ", ";
		}
		retorno+= letras[letras.length - 1];
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
