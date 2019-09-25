import java.util.ArrayList;

public class Jugador {

	private String nom;
	private ArrayList<Carta> cartes;
	public Jugador(String nom) {
		super();
		this.nom = nom;
		this.cartes= new ArrayList<Carta>(); 

	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Carta> getCartes() {
		return cartes;
	}
	public void setCartes(ArrayList<Carta> cartes) {
		this.cartes = cartes;
	} 

	public void  darCarta(Carta carta) {
		cartes.add(carta);
	}

	public Carta  retirarCarta(int index) {
		return cartes.remove(index);
	}
	
	public String joc() {
		String ma="["; 
		for (int i=0; i<cartes.size(); i++) {
			if (i!=0) {
				ma=ma+",";
			}
			ma= ma+cartes.get(i).toString();
			
			
		}
		
		ma=ma+"]";
		return ma;
	}
}
