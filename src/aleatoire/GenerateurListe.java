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
	
	public static List<Double> listeNbAleatoireLoiUniformeTheorique() {
		List<Double> listeAleat = new ArrayList<>();
		double procheZero = 1.0E-4D;
		
		for (int i = 0; i<nbSimulation; i++) {
			double element = procheZero + i / 1000.0D;
			listeAleat.add(Double.valueOf(element));
		}
		return listeAleat;
	}
	
	public static List<Double> listeNbAleatoireLoiExponentielle(double lambda) {
		List<Double> listeAleat = new ArrayList<>();
		
		for (int i = 0; i<nbSimulation; i++) {
			listeAleat.add(Double.valueOf(Lois.loisExpo(GenerateurAleatoire.generateurAleatoire(), lambda)));
		}
		
		return listeAleat;
	}
	
	public static List<Double> listeNbAleatoireLoiExponentielleTheorique(double lambda) {
		Double[] populationParClasse = { Double.valueOf(669.0D), Double.valueOf(210.0D), Double.valueOf(64.0D), Double.valueOf(19.0D), Double.valueOf(6.0D), Double.valueOf(2.0D), Double.valueOf(1.0D), Double.valueOf(0.0D), Double.valueOf(0.0D), Double.valueOf(0.0D) };
	    
	    ListeClasse listeClasse = new ListeClasse(10, 0.0D, 1.0D);
	    for (int i = 0; i < populationParClasse.length; i++)
	    {
	      for (int j = 0; j < populationParClasse[i].doubleValue(); j++) {
	        ((Classe)listeClasse.getClasses().get(i)).ajouter(Double.valueOf(((Double)((Classe)listeClasse.getClasses().get(i)).getBorneInf()).doubleValue() + 1.0E-6D));
	      }
	    }
	    
	    return listeClasse;
	}
	
	public static List<Double> listeNbAleatoireLoiNormale() {
		List<Double> listeAleat = new ArrayList<>();
		
		for (int i = 0; i<nbSimulation; i++) {
			listeAleat.add(Double.valueOf(Lois.loisNormale(GenerateurAleatoire.generateurAleatoire(), GenerateurAleatoire.generateurAleatoire())));
		}
		
		return listeAleat;
	}
}
