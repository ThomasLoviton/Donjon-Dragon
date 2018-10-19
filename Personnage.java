
public class Personnage {

	public String name;
	private int ATK;
	private int PV;
	private int VIT;
	
	public Personnage(String name, int ATK, int PV, int VIT) {
		
		this.name = name;
		this.ATK = ATK;
		this.PV = PV;
		this.VIT = VIT;
	}
	
	public int getATK() {
		
		return ATK;
	}
	public int getPV() {
				
		return PV;
	}

	public int getVIT() {
		
		return VIT;
	}

	private int randomNumber() {
		
		int randomNumber = (int)Math.floor(Math.random() * 10);
		return randomNumber;
	}
}
