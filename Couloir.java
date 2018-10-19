
public class Couloir extends Donjon{

	char lettre = 'A';
	public Couloir(char lettre) {
		this.lettre = lettre;
	}
	
	public String toString() {
		// E : entrée; C : Couloir; S : Sortie;
		String phrase = "";
		if(lettre == 'E') {
			phrase = "En espérant que vous allez en resortir vivant... Bonne chance !";
		}
		else if(lettre == 'C') {
			//en rajouter et en choisir 1 aleatoire dans un tableau 
			
			String tabPhrase[] = new String[3];	
			tabPhrase[0] = "Un long couloir vous attend ...";
			tabPhrase[1] = "C'est le moment de vous reposer !";
			tabPhrase[2] = "Ca continue !";
			int nb = (int)Math.floor(Math.random() * 10);	
			
			while(nb > 2) {
				
				nb = (int)Math.floor(Math.random() * 10);					
			}
			
			if(nb <= 2) {
				
				phrase = tabPhrase[nb];
			}
		}
		else if(lettre == 'S') {
			phrase = "Il vous fraudra un long moment avant de sortir !";
		}
		else {
			phrase = "Pas bonne lettre";
		}
		
		return phrase;
	}
}
	
