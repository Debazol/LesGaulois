package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbequipement=0;

	public Romain(String nom, int force) {
		assert (force>0)==true;
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		int debut=force;
		assert (debut>0)==true;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
			} 
		else {
			parler("J'abandonne...");
			}
		int fin=force;
		assert (debut>fin)==true;
	
	}
	
	public void afficherEquipement() {
		for (Equipement Equipement:Equipement.values()) {
			System.out.println("-"+Equipement);
		}
	}
	
	private void equiper(Equipement equipement) {
		equipements[nbequipement]=equipement;
		nbequipement++;
		System.out.println("Le soldat "+ nom+ " s'équipe qvec un "+equipement+" .");
	}
	public void sequiper( Equipement equipement) {
		
		switch (nbequipement) {
		case 0: 
			equiper(equipement);
			break; 
		
		case 1:
			if (equipements[0]!=equipement) {
				equiper(equipement);			
				}
			else {
			System.out.println("Le soldat "+ nom+ " possède deja un "+equipement+" ." );
			}
			break;	
		
		default:
		case 2:
			System.out.println("Le soldat " + nom + " est deja bien protege !");
			break;
		}
	}
//		if (nbequipement<2) {
//			equipements[nbequipement]=equipement;
//			if (equipements[nbequipement]==equipement) {
//				System.out.println("Le soldat "+nom+" possède déja un "+ equipement+"!");
//			}
//			nbequipement++;
//			System.out.println("Le soldat "+ nom+ "s'équipe qvec un "+equipement+" ." );
//		}
//		System.out.println("Le soldat " + nom + " est deja bien protege !");
//	}
	public static void main(String[] args) {
//		Romain cesar= new Romain("cesar", 4);
//		System.out.println(cesar.getNom());
///		cesar.parler("bonjour");
//		cesar.recevoirCoup(2);
//		cesar.recevoirCoup(5);
		
		Romain minus= new Romain("minus", 6);
		minus.sequiper(Equipement.CASQUE);
		minus.sequiper(Equipement.CASQUE);
		minus.sequiper(Equipement.BOUCLIER);
		minus.sequiper(Equipement.CASQUE);
		
		
		
	}


}
