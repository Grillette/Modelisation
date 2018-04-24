package aleatoire;

import java.util.ArrayList;
import java.util.List;

public class ListeClasse {
	private int nbClasse;
	private double borneInf;
	private double borneSupp;
	private List<Borne<Double>> listeClasse;
	
	public ListeClasse() {
		
	}
	
	public ListeClasse(int pNbClasse, double pBorneInf, double pBorneSupp) {
		listeClasse = new ArrayList();
		
		this.nbClasse = pNbClasse;
		this.borneInf = pBorneInf;
		this.borneSupp = pBorneSupp;
		
		double intervalle = (pBorneSupp - pBorneInf) / pNbClasse;
		for (int i = 0; i<nbClasse; i++) {
			listeClasse.add(new Borne(Double.valueOf(pBorneInf + intervalle * i), Double.valueOf(pBorneInf + intervalle * (i+1))));
		}
	}
	
	public void ajouterElement(double element) throws Exception {
		if((element < borneInf) || (borneSupp < element)) {
			throw new Exception();
		}
		
		for (int i = 0; i<nbClasse; i++) {
			if ((element > ((Double)((Borne)listeClasse.get(i)).getBornesInf()).doubleValue()) && (element < ((Double)((Borne)listeClasse.get(i)).getBornesSupp()).doubleValue())) {
				((Borne)listeClasse.get(i)).ajouter(Double.valueOf(element));
			}
		}
	}
	
	public int getNbClasse() {
		return nbClasse;
	}
	
	public double getBorneInf() {
		return borneInf;
	}
	
	public double getBorneSupp() {
		return borneSupp;
	}
	
	public int getNbElements() {
		int nbElement = 0;
		for (Borne<Double> classe : listeClasse) {
			nbElement += classe.nbElements();
		}
		
		return nbElement;
	}
}
