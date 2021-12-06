package comunicacion;

public class Fabula extends Escrito {
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	private String ensenanza;
	private String interpretacion;
	
	public int palabrasTotales(int palabrasPagina) {
		return getPaginas()*palabrasPagina;
	}
	public String interpretacion() {return interpretacion;}
	public String toString() {
		return getOrigen() + "\n"
				+ getTitulo() + "\n"
				+ getAutor() + "\n"
				+ getPaginas() + "\n"
				+ ensenanza;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}