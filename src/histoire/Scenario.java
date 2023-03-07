package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois ("astérix", 8);
		Romain minus = new Romain ("minus",6);
		asterix.parler("bonjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		minus.recevoirCoup(6);

	}

}
