
public abstract class Peripherique {

	public Peripherique() {

	}
	public abstract void allumer();
	/**
	 * permet de changer l'etat interne d'une lampe en l'eteignant
	 */
	public abstract void eteindre();

	/**
	 * retourne le descriptif de la lampe sous la forme nom + "On"/"Off"
	 */
	public abstract String toString();

}
