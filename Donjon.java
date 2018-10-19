import java.util.*;

public class Donjon {

	private String nom;
	
	public void entrer() {
		
		System.out.println("Voulez-vous rentrer dans le donjon ?");
		Scanner scan = new Scanner(System.in);
		String reponse = scan.nextLine();
		if(!reponse.equals("Oui") && !reponse.equals("Non")) {	
			while(!reponse.equals("Oui") && !reponse.equals("Non")) {
			
				System.out.println("Veuillez saisir Oui ou Non !");
				reponse = scan.nextLine();
			}
		}
		else if(reponse.equals("Non")) {			
			scan.close();		
			System.out.println("A bientôt dans le jeu Donjons & Dragons");
			System.exit(0);
		}
	}
	
	public boolean sortir() {
		
		boolean test = false;
		
		System.out.println("Voulez-vous sortir dans le donjon ?");
		Scanner scan = new Scanner(System.in);
		String reponse = scan.nextLine();
		if(!reponse.equals("Oui") && !reponse.equals("Non")) {	
			while(!reponse.equals("Oui") && !reponse.equals("Non")) {
			
				System.out.println("Veuillez saisir Oui ou Non !");
				reponse = scan.nextLine();
			}
		}
		else if(reponse.equals("Oui")) {
			test = true;
			scan.close();		
			System.out.println("A bientôt dans le jeu Donjons & Dragons");
			System.exit(0);
		}
		
		return test;
	}
}
