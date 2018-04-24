package aleatoire;

import java.util.ArrayList;
import java.util.List;

public class Borne<E> {
	private List<E> elements;
	private E bornesInf;
	private E bornesSup;
	
	public Borne(E pBornesInf, E pBornesSup) {
		elements = new ArrayList();
		
		this.bornesInf = pBornesInf;
		this.bornesSup = pBornesSup;
	}
	
	public void ajouter(E aAjouter) {
		elements.add(aAjouter);
	}
	
	public void supprimer(E aSupprimer) {
		elements.remove(aSupprimer);
	}
	
	public int nbElements() {
		return elements.size();
	}
	
	public boolean estVide() {
		return elements.isEmpty();
	}
	
	public E getBornesInf() {
		return bornesInf;
	}
	
	public E getBornesSupp() {
		return bornesSup;
	}
	
	
	
}
