package aleatoire;

import java.util.ArrayList;
import java.util.List;

public class GenerateurListe {
	public static int nbSimulation = 1000;
	
	
	public static void main(String[] args) {
		
		List<Double> listeUniforme = listeNbAleatoireLoiUniforme();
		
		for (int i = 0; i<listeUniforme.size(); i++) {
			System.out.println(listeUniforme.get(i));
		}
	}
	
	
	public static List<Double> listeNbAleatoireLoiUniforme() {
		List<Double> listeAleat = new ArrayList<>();
		
		for (int i = 0; i<nbSimulation; i++) {
			listeAleat.add(Double.valueOf(GenerateurAleatoire.generateurAleatoire()));
		}
		
		return listeAleat;
	}
	
}
