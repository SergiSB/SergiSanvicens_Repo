import java.util.ArrayList;
import java.util.Scanner;

public class PartidaMus {

	public static void main(String[] args) {
		
		Mus mus= new Mus(new ArrayList<Jugador>());
		
		Scanner lector = new Scanner (System.in);
		
	
		for (int i=0; i<4;i++) {
			
			String nomsJugadors= lector.next();
			Jugador jugador= new Jugador(nomsJugadors); 
			mus.addJugador(jugador);
			
		}

		lector.close();
	}

}
