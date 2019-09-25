import java.util.ArrayList;

public class Francesa extends Baralla {

	String[] pals= {"piques","trèvols","diamants","cors"};
	String[] noms= {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public void reiniciar() {
	
		if (cartes!=null) {
			cartes.clear();
		} else {
			cartes= new ArrayList <Carta>();
		}
		for (int i=0;i<pals.length;i++) {
			for (int j=0;j<noms.length;j++) {
				cartes.add(new Carta(pals[i],noms[j],j<10?j+1:10));
			} 
		}
	}
	public Francesa() {
		super();
		reiniciar();
	}
	
	

}
