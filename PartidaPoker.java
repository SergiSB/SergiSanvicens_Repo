import java.util.ArrayList;
import java.util.Scanner;

public class PartidaPoker {

	public static void main(String[] args) {
	
	
			Poker poker= new Poker(new ArrayList<Jugador>());
			
			Scanner lector = new Scanner (System.in);
			System.out.println("Introdueix numero de jugadors :");
			
			int numJugador=0; 
			try {
				numJugador=Integer.parseInt(lector.next());
			} catch (NumberFormatException e) {
			
				System.out.println("Has d'introduïr un enter");
			}
			
		
			for (int i=0; i<numJugador;i++) {
				
				System.out.println("Introdueix jugador "+(i+1) +":");
				String nomsJugadors= lector.next();
				Jugador jugador= new Jugador(nomsJugadors); 
				poker.addJugador(jugador);
				
				
			}

			lector.close();
			System.out.println("Hi ha inscrits:"+numJugador);
	}
}


