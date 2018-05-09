
import java.util.*;

public class Telecommande {
	private ArrayList<Lampe> lampes;
	
	public Telecommande() {
		// TODO Auto-generated constructor stub
	}
	public void ajouterLampe(Lampe l){
		lampes.add(l);
	}
	public void activerLampe(int indiceLampe){
		lampes.get(indiceLampe).allumer();
	}
	public void desactiverLampe(int indiceLampe){
		lampes.get(indiceLampe).eteindre();
	}
	public void activerTout(){
		for(int i=0;i<lampes.size();i++){
			lampes.get(i).allumer();
		}
	}
	public String toString(){
		String res="";
		for(int i=0;i<lampes.size();i++){
			res ="Lampe "+i+lampes.get(i).toString();;
		}
		return res; 
		
	}

}
