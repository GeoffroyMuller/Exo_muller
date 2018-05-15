
import java.util.*;

public class Telecommande {
	private ArrayList<Lampe> lampes;
	private ArrayList<Hifi> hifis;
	private ArrayList<Television> televisions;

	public Telecommande() {
		// TODO Auto-generated constructor stub
		lampes = new ArrayList<Lampe>();
		hifis = new ArrayList<Hifi>();
		televisions = new ArrayList<Television>();
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

		for(int i=0;i<hifis.size();i++){
			hifis.get(i).allumer();
		}
		
		for(int i=0;i<televisions.size();i++){
			televisions.get(i).allumer();
		}
	}

	public void ajouterHifi(Hifi h){
		hifis.add(h);
	}
	public void activerHifi(int indiceHifi){
		hifis.get(indiceHifi).allumer();
	}
	public void desactiverHifi(int indiceHifi){
		hifis.get(indiceHifi).eteindre();
	}

	public void ajouterTelevision(Television t){
		televisions.add(t);
	}
	public void activerTelevision(int indiceTelevision){
		televisions.get(indiceTelevision).allumer();
	}
	public void desactiverTelevision(int indiceTelevision){
		televisions.get(indiceTelevision).eteindre();
	}


	public String toString(){
		String res="";
		for(int i=0;i<lampes.size();i++){
			res =res+"Lampe "+i+lampes.get(i).toString();
		}

		res = res+" || ";
		for(int i=0;i<hifis.size();i++){
			res =res+"Hifi "+i+hifis.get(i).toString();
		}
		
		res = res+" || ";
		for(int i=0;i<televisions.size();i++){
			res =res+"Television "+i+televisions.get(i).toString();
		}
		
		return res;

	}
	public Lampe getLampes(int i) {
		return lampes.get(i);
	}
	public void setLampes(ArrayList<Lampe> lampes) {
		this.lampes = lampes;
	}



}
