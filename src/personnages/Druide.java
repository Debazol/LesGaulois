package personnages;

import personnages.Gaulois;
import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller"
				+ " d'une force " + effetPotionMin + " � "
				+ effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void preparerPotion() {
		Random p = new Random();
		int force= p.nextInt(effetPotionMax-effetPotionMin)+effetPotionMin;
		if (force>7) {
		parler("J'ai pr�par� une super potion de force  "+force);
		}
		else {
			parler(" Je n'ai pas trouv� tous les ingr�dients,"
					+ " ma potion est seulement de force "+force);
		}
		
	}
	
	public void booster(Gaulois gaulois) {
		gaulois.boirePotion(forcePotion);
		
		if (gaulois.getNom()=="Ob�lix") {
			parler(" Non, Ob�lix !... Tu n�auras pas de potion\r\n" + 
					"magique ! ");
		}
		
	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
		Gaulois Ob�lix = new Gaulois ("Ob�lix", 8);
		Gaulois asterix = new Gaulois ("ast�rix", 8);
		Ob�lix.boirePotion(5);
		panoramix.booster(Ob�lix);
		panoramix.booster(asterix);
		asterix.boirePotion(5);
		
	}


}
