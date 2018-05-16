
import java.util.*;

public class Telecommande {
	private ArrayList<Peripherique> peripheriques;

	public Telecommande() {
		peripheriques = new ArrayList<Peripherique>();
	}
	public void ajouterPeripherique(Peripherique p){
		peripheriques.add(p);
	}
	public void activerPeripherique(int indicePeripherique){
		peripheriques.get(indicePeripherique).allumer();
	}
	public void desactiverPeripherique(int indicePeripherique){
		peripheriques.get(indicePeripherique).eteindre();
	}

	public void activerTout(){
		for(int i=0;i<peripheriques.size();i++){
			peripheriques.get(i).allumer();
		}


	}



	public String toString(){
		String res="";
		for(int i=0;i<peripheriques.size();i++){
			res = res+peripheriques.get(i).toString();
		}
		
		
		return res;

	}




}
