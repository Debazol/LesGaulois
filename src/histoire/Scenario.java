package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois ("asterix", 8);
		Romain minus = new Romain ("minus",6);
		Druide panoramix= new Druide ("panoramix",6,10);
		panoramix.parler("je vais aller preparer une petite potion");
		panoramix.preparerPotion();
		
		Gaulois Obélix = new Gaulois ("Obélix", 8);
		panoramix.booster(Obélix);
		panoramix.booster(asterix);
		
		asterix.parler("bonjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	

	}

}
