import java.util.ArrayList;

public class Espanyola extends Baralla {
	
	String[] pals= {"espases","bastos","ors","copes"};
	String[] noms= {"1","2","3","4","5","6","7","SOTA","CAVALL","REI"};
	
	@Override
	public void reiniciar() {

		if (cartes!=null) {
			cartes.clear();
		} else {
			cartes= new ArrayList <Carta>();
		}
		for (int i=0;i<pals.length;i++) {
			for (int j=0;j<noms.length;j++) {
				cartes.add(new Carta(pals[i],noms[j],j<7?j+1:10));
			} 
		}
	}
	public Espanyola() {
		super();
		reiniciar();
	}
	
}
