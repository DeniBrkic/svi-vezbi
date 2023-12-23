import java.util.Scanner;
public class Depozit {

	public static void main(String[] args) {
		double depozit; 
		double kamatnaStapka; 
		double iznosKamata;
Scanner tastatura = new Scanner (System.in);
System.out.print("Vnesi poceten depozit: ");
depozit = tastatura.nextDouble();
System.out.print("Vnesi godisna kamatna stapka: ");
kamatnaStapka = tastatura.nextDouble();
iznosKamata = depozit * kamatnaStapka;
depozit = depozit + iznosKamata;
System.out.println();
System.out.print("Paricen iznos na godisna kamata: ");
System.out.println(iznosKamata);
System.out.println("Zgolemen depozit posle 1 godina: ");
System.out.println(depozit);
	}

}
