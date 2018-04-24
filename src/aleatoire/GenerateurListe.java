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
	
	public static ListeClasse listeNbAleatoireLoiExponentielleTheorique(double lambda) {
		Double[] populationParClasse = { Double.valueOf(669.0D), Double.valueOf(210.0D), Double.valueOf(64.0D), Double.valueOf(19.0D), Double.valueOf(6.0D), Double.valueOf(2.0D), Double.valueOf(1.0D), Double.valueOf(0.0D), Double.valueOf(0.0D), Double.valueOf(0.0D) };
	    
	    ListeClasse listeClasse = new ListeClasse(10, 0.0D, 1.0D);
	    for (int i = 0; i < populationParClasse.length; i++)
	    {
	      for (int j = 0; j < populationParClasse[i].doubleValue(); j++) {
	        ((Borne)listeClasse.getClasses().get(i)).ajouter(Double.valueOf(((Double)((Borne)listeClasse.getClasses().get(i)).getBornesInf()).doubleValue() + 1.0E-6D));
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
	
	public static ListeClasse listeNbAleatoireLoiNormaleTheorique() {
		Double[] populationParClasse = { Double.valueOf(0.0D), Double.valueOf(1.0D), Double.valueOf(22.0D), Double.valueOf(136.0D), Double.valueOf(341.0D), Double.valueOf(341.0D), Double.valueOf(136.0D), Double.valueOf(22.0D), Double.valueOf(1.0D), Double.valueOf(0.0D) };
		
		ListeClasse listeClasse = new ListeClasse(10, 0.0D, 10.0D);
		
		for (int i = 0; i<populationParClasse.length; i++) {
			for (int j = 0; j<populationParClasse[i].doubleValue(); j++) {
				((Borne)listeClasse.getClasses().get(i)).ajouter(Double.valueOf(((Double)((Borne)listeClasse.getClasses().get(i)).getBornesInf()).doubleValue() + 1.0E-6D));
			}
		}
		
		return listeClasse;
	}
	
	public static ListeClasse trierListe(List<Double> listeATrier, double pBorneInf, double pBorneSupp) throws Exception {
		ListeClasse listeClasse = new ListeClasse(10, pBorneInf, pBorneSupp);
		
		for (int i = 0; i<listeATrier.size(); i++) {
			listeClasse.ajouterElement(((Double)listeATrier.get(i)).doubleValue());
		}
		
		return listeClasse;
	}
	
	// @TODO
	public static Double khi2(ListeClasse listeTheorique, ListeClasse listeConstate) {
		return null;
	}
}
