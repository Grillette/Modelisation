package aleatoire;

public class Lois {
	public Lois() {
		
	}
	
	public static double loisUniforme(double nbAleat) {
		return nbAleat;
	}
	
	public static double loisExpo(double nbAleat, double lambda) {
		return -1.0D / lambda * Math.log(nbAleat);
	}
	
	public static double loisNormale(double nbAleat1, double nbAleat2) {
		return Math.sqrt(-2.0D*Math.log(nbAleat1)*Math.cos(2*Math.PI*nbAleat2));
	}
	
}
