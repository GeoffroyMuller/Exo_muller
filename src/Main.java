import java.util.Scanner;

/**
 * classe qui cree des lampes et une telecommande associee.
 */

public class Main {

	public static void main(String args[]) {
		// la telecommande vide
		Telecommande t = new Telecommande();

		// ajoute des objets
		// utilisation de refactor (extract method)
		// pour rendre le code plus clair
		ajouter4Lampes(t);

		// test d'activation
		t.activerPeripherique(1);
		t.activerPeripherique(3);
		//System.out.println(t);

		// gestion du menu
		lancerMenu(t);
	}

	/**
	 * menu qui permet de manipuler une telecommande
	 * 
	 * @param t
	 *            telecommande a manipuler
	 */
	private static void lancerMenu(Telecommande t) {
		System.out.println(t);
		Scanner sc = new Scanner(System.in);
		
		boolean fini=false;
		
		// tant qu'il y a des commandes
		while (!fini) {
			
			// demande lampe et commande
			System.out.println("entrer le numero du peripherique");
			int choix = sc.nextInt();
			System.out.println("entrer commande (+/-/exit)");
			String com = sc.nextLine();
			com = sc.nextLine();

			// si la commande est +, on active
			if (com.equals("+")) {
				System.out.println("== activer "+choix+"==");
				t.activerPeripherique(choix);
			}
			// si la commande est - on descactive
			else if (com.equals("-")) {
				System.out.println("== desactiver "+choix+"==");
				t.desactiverPeripherique(choix);
			}
			// si la commande est exit, on arrete
			else if (com.equals("exit")) {
				System.out.println("== Fin du programme == ");
				fini=true;
			}
			// commande non reconnue
			else {
				System.out.println("commande inconnue");
			}
			
			//affiche l'etat de le telecommande
			System.out.println(t);
		}
		sc.close();
	}

	/**
	 * creation des objets et ajout dans la telecommande
	 * 
	 * @param t
	 *            telecommande dans lequelle on ajoute 4 lampes
	 */
	private static void ajouter4Lampes(Telecommande t) {
		Lampe l1 = new Lampe("Lampe1");
		t.ajouterPeripherique(l1);

		Lampe l2 = new Lampe("Lampe2");
		t.ajouterPeripherique(l2);

		Lampe l3 = new Lampe("Lampe3");
		t.ajouterPeripherique(l3);

		Lampe l4 = new Lampe("Lampe4");
		t.ajouterPeripherique(l4);
		
		Television t1 = new Television();
		t.ajouterPeripherique(t1);
		
		Television t2 = new Television();
		t.ajouterPeripherique(t2);
		
		Television t3 = new Television();
		t.ajouterPeripherique(t3);
		
		Television t4 = new Television();
		t.ajouterPeripherique(t4);
	}

}
