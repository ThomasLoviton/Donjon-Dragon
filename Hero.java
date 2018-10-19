
public class Hero extends Personnage{

	public Hero(String nom, int ATK, int PV, int VIT) {
		super(nom, ATK, PV, VIT);
	}
	
	public String getHeroName() {
		return this.name;
	}
}
