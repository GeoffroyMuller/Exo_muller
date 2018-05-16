import static org.junit.Assert.*;

import org.junit.Test;

public class TelecommandeTest {

	@Test
	public void ajoutlampe_Telecommande_Vide(){
		Telecommande t=new Telecommande();
		Lampe l = new Lampe("lampe1");
		t.ajouterPeripherique(l);
		assertEquals("une lampe aurait du etre ajouter", "lampe1", t.getLampes(0).getNom());
	}
	@Test
	public void ajoutlampe_Telecommande_UnElement(){
		Telecommande t=new Telecommande();
		Lampe l1 = new Lampe("lampe1");
		Lampe l2 = new Lampe("lampe2");
		t.ajouterPeripherique(l1);
		t.ajouterPeripherique(l2);
		assertEquals("une lampe aurait du etre ajouter", "lampe1", t.getLampes(0).getNom());
		assertEquals("une deuxieme lampe aurait du etre ajouter", "lampe2", t.getLampes(1).getNom());
	}
	@Test
	public void activelampe_existante_posi0(){
		Telecommande t=new Telecommande();
		Lampe l = new Lampe("lampe1");
		t.ajouterPeripherique(l);
		t.activerLampe(0);
		assertEquals("la lampe devrait etre activer",true,t.getLampes(0).isAllume());
	}
	@Test
	public void activelampe_existante_posi1(){
		Telecommande t=new Telecommande();
		Lampe l1 = new Lampe("lampe1");
		Lampe l2 = new Lampe("lampe2");
		t.ajouterPeripherique(l1);
		t.ajouterPeripherique(l2);
		t.activerLampe(1);
		assertEquals("la lampe 1 devrait etre desavtiver",false,t.getLampes(0).isAllume());
		assertEquals("la lampe 2 devrait etre activer",true,t.getLampes(1).isAllume());
	}
	@Test
	public void activelampe_inexistante(){
		Telecommande t=new Telecommande();
		boolean tes=false;
		try{
		t.getLampes(0);
		}catch (IndexOutOfBoundsException i){
			tes=true;
		}
		assertEquals("la lampe ne devrait pas exister",true,tes);
		
	}


}
