import java.util.Scanner;
public class BrzinaAviona {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vnesete vreme (vo casovi) na patuvanjeto na avionot:");
		double vreme = input.nextDouble();
		
		System.out.println("Vnesete izminat pat na avionot (vo kilometri):");
		double pat = input.nextDouble();
		
		System.out.println("Vnesite brzina na avionot (vo kilometri na cas):");
		double brzina = input.nextDouble();
		
		double vremenskaBrzina = pat / vreme;
		
		if (vremenskaBrzina > brzina) {
	    System.out.println("Avionot go izminuva patot pobrzo od zadadeneta brzina.");
			
	  } else if	(vremenskaBrzina < brzina) {
		System.out.println("Avionot go izminuva patot pomalku brzo od zadanata brzina.");
		
	  } else {
		System.out.println("Avionot go izminuva patot so ista brzina kako sto e zadadena."); 
		}
		

	}

}
