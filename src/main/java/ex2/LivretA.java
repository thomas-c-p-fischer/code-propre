package ex2;

public class LivretA extends CompteBancaire {
	
	/** Constructeur
	 * @param type
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde < 0 ? 0 : solde, 0, tauxRemuneration);
	}

}
