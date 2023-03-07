package personnages;

public class Gaulois {	
	private String nom;
	private int force;
	private int effetPotion=1;

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreparole()+ "<<" + texte +">>");
		
	}
	private String prendreparole() {
		return "Le gaulois "+ nom + ":";
		
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " "
				+ "envoie un grand coup dans la machoire de " 
				+ romain.getNom());
		romain.recevoirCoup((force/3)*effetPotion);
		
	}
	public void setNom(String nom) {
		this.nom = nom;
	}	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		
		parler("Merci Druide, je sens que ma potion est +effetPotion+ fois décuplée.");
		}
	}

	public static void main(String[] args) {
		Gaulois debascott= new Gaulois("debascott", 10);
		System.out.println(debascott.getNom());
		
		Romain cesar= new Romain("cesar", 4);
		System.out.println(cesar.getNom());
		
		debascott.parler("bonjour");
		debascott.frapper(cesar);
	
		Gaulois asterix = new Gaulois ("astérix", 8);
		System.out.println(asterix.getNom());
		
		asterix.prendreparole();
		System.out.println(asterix);
	}
	
}