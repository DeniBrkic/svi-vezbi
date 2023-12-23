import java.util.Scanner;
   public class Uspeh {
   
   public static void metodUspeh(double bodovi) {
       if (bodovi >= 8.5) {
System.out.println("Odlicen");
}     else if (bodovi >= 7.5) {
System.out.println("Mnogu dobar");
}     else if (bodovi >= 5.5) {
System.out.println("Dobar");
}     else if (bodovi >= 3.5) {
System.out.println("Dovolent");
}     else {
System.out.println("Nedovolen");
}
}
   public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Vnesi bodovi od 1-10\n");
System.out.print("Broj na bodovi: ");
      double bodovi = input.nextDouble();
System.out.print("Za broj na bodovi " + bodovi + " uspehot e: ");
metodUspeh(bodovi);
}
}