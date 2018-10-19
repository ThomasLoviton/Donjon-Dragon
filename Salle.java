import java.util.ArrayList;

public class Salle extends Donjon {

	private String nom;
	Salle tabSalle[] = new Salle[3];
	
	public Salle() {
	}
	
	private String getNom() {
		return nom;
	}
	
	public String getNameSalleDragon(Dragon dragon) {
		
		String salleDragonName = "Bienvenue dans la salle du dragon " + dragon.getDragonName();
		return salleDragonName;
	}
	public void choixSalle(Salle laSalle, Dragon d) {
			
		tabSalle[0] = new SalleDragon(d);
		tabSalle[1] = new SalleTresor();
		tabSalle[2] = new SalleVide();
		int nb = (int)Math.floor(Math.random() * 10);	
		
		while(nb > 2) {
			
			nb = (int)Math.floor(Math.random() * 10);					
		}
		
		if(nb <= 2) {
			
			laSalle = tabSalle[nb];
			
			if(nb == 0) {
				System.out.println(laSalle.getNameSalleDragon(d));
			}
			if(nb == 1) {
				System.out.println("Bienvenue dans cette salle à trésor, mais lequel ?");
			}
			if(nb == 2) {
				System.out.println("Bienvenue dans cette salle vide");
			}
			
		}
		
	}
	
	public void combat(Dragon d, Hero h) {
		
		int dragonATK = d.getATK();
		int heroATK = h.getATK();
		int dragonPV = d.getPV();
		int heroPV = h.getPV();
		int dragonVIT = d.getVIT();
		int heroVIT = h.getVIT();
		
		dragonPV = dragonPV - heroATK;
		System.out.println(dragonPV);
	}
	
}
