
public class Carta {


	private String pal;
	private String nom;
	private int valor;

	public Carta(String pal, String nom, int valor) {
		super();
		this.pal = pal;
		this.nom = nom;
		this.valor = valor;
	}

	public String getPal() {
		return pal;
	}

	public void setPal(String pal) {
		this.pal = pal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		
		return nom+" de "+ pal;

	} 




}


