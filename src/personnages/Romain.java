package personnages;

public class Romain {
	private String nom;
	private int force;

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
	public static void main(String[] args) {
		Romain cesar= new Romain("cesar", 4);
		System.out.println(cesar.getNom());
//		cesar.parler("bonjour");
		cesar.recevoirCoup(2);
		cesar.recevoirCoup(5);
		
		Romain minus= new Romain("minus", 6);
		
	}


}
