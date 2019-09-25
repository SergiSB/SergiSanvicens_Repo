import java.util.ArrayList;

public class Mus {

	private Espanyola baralla;
	private ArrayList<Jugador> llistaJugadors;
	
	 public void addJugador(Jugador j) {
		 llistaJugadors.add(j);
	 }

	public Mus(ArrayList<Jugador> llistaJugadors) {
		super();
		this.llistaJugadors = llistaJugadors;
		baralla= new Espanyola();
	}
	 
	 
}

