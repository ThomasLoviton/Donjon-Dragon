
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero Mario = new Hero("Mario", 100, 100, 100);
		Hero KingKong= new Hero("King Kong", 500, 500, 25);
		Hero Pikachu = new Hero("Pikachu", 200, 75, 200);
		Hero Sonic = new Hero("Sonic", 150, 50, 300);
		Hero Asterix = new Hero("Asterix", 250, 150, 250);
		Hero Obelix = new Hero("Obelix", 350, 300, 75);
		
		Hero tabHero[] = new Hero[7];
		tabHero[0] = Mario;
		tabHero[1] = KingKong;
		tabHero[3] = Pikachu;
		tabHero[4] = Sonic;
		tabHero[5] = Asterix;
		tabHero[6] = Obelix;
		

		int nbHero = (int)Math.floor(Math.random() * 10);	
		Hero leHero = null;
		while(nbHero > 6) {
			
			nbHero = (int)Math.floor(Math.random() * 10);					
		}
		
		if(nbHero <= 6) {
						
			leHero= tabHero[nbHero];		
		}
		
		
		
		Dragon dragonFire = new Dragon("Fire", 10, 10, 10);
		Dragon dragonIce = new Dragon("Ice", 5, 15, 10);
		Dragon dragonElectric = new Dragon("Electric", 10, 10, 15);
			
		Dragon tabDragon[] = new Dragon[3];
		tabDragon[0] = dragonFire;
		tabDragon[1] = dragonIce;
		tabDragon[2] = dragonElectric;

		int nbDragon = (int)Math.floor(Math.random() * 10);	
		Dragon leDragon = null;
		while(nbDragon > 2) {
			
			nbDragon = (int)Math.floor(Math.random() * 10);					
		}
		
		if(nbDragon <= 2) {
						
			leDragon= tabDragon[nbDragon];		
		}
		System.out.println("Bienvenue dans le jeu Donjons & Dragons");
		System.out.println("Votre Héro pour cette partie est " + leHero.getHeroName());
		Donjon leDonjon = new Donjon();
		
		leDonjon.entrer();	
		Couloir couloirEntree = new Couloir('E');
		System.out.println(couloirEntree.toString());
		
		Salle uneSalle = new Salle();
		
		uneSalle.choixSalle(uneSalle, leDragon);
		uneSalle.combat(leDragon, leHero);
		while(leDonjon.sortir() == false) {
			
			
		}
		if (leDonjon.sortir() == true){
			Couloir couloirSortie = new Couloir('S');
			System.out.println(couloirSortie.toString());
		}
		
	}
}
