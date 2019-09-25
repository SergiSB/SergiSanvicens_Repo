import java.util.ArrayList;
import java.util.Collections;

public abstract class Baralla {

	protected ArrayList<Carta> cartes;
	
	public void barallar() {
		Collections.shuffle(cartes);
	}
	
	public Carta repartir() {
		return cartes.remove(0);
	
	}
	
	public abstract void reiniciar(); 
}

