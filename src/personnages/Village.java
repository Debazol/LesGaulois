package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private int nbVillageoisMaximum;
	private Gaulois[] villageois;
	
	
	
	
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois= new Gaulois[nbVillageoisMaximum];
		
		}
	
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[nbVillageois]=gaulois; 
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int nbVillageois) {
		return villageois[nbVillageois];
		
	}
	
	public void afficherVillageois(){
		System.out.println("Dans le village du chef " +chef.getNom()+" vivent les legédaires gaulois :");
		for (int i=1;i<nbVillageois;i++) {
			System.out.println("-"+villageois[i].getNom());
		}
		
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		//Gaulois gaulois= village.trouverHabitant(30);
		//L'indice 30 est en dehors du tableau le dernier habitant est d'indice 29
		
		
		Chef abraracourcix= new Chef("abracourcix",6,village);
		village.setChef(abraracourcix);
		
		Gaulois asterix = new Gaulois("asterix",8);
		village.ajouterHabitant(asterix);
		
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		Duplicate local variable gaulois
//
//		at personnages.Village.main(Village.java:55)
		//si il y a un seul habitant cest lhabitant d'indice 0 
		
		Gaulois obelix = new Gaulois("obelix",25);
	    village.ajouterHabitant(asterix);
	    village.ajouterHabitant(obelix);
	    village.afficherVillageois();
	    }
}

