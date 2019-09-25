import java.util.ArrayList;

public class Poker {

	private Francesa baralla;
	private ArrayList<Jugador> llistaJugadors;
	
	 public void addJugador(Jugador j) {
		 llistaJugadors.add(j);
	 }

	public Poker(ArrayList<Jugador> llistaJugadors) {
		super();
		this.llistaJugadors = llistaJugadors;
		baralla= new Francesa();
		if (llistaJugadors.size()<2) {
			System.out.println("Falten jugadors");
		}
	}
	 
	 
}
