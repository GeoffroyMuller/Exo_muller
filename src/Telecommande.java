
import java.util.*;

public class Telecommande {
	private ArrayList<Lampe> lampes;
	
	
	public Telecommande() {
		// TODO Auto-generated constructor stub
		lampes = new ArrayList<Lampe>();
		
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
			res =res+"Lampe "+i+lampes.get(i).toString();
		}
		
		
	}
	public Lampe getLampes(int i) {
		return lampes.get(i);
	}
	public void setLampes(ArrayList<Lampe> lampes) {
		this.lampes = lampes;
	}
	public static void main(String[] args) {
		Telecommande t=new Telecommande();
		Lampe l = new Lampe("lampe1");
		System.out.println("ee"+t.getLampes(0));
	}
	

}
