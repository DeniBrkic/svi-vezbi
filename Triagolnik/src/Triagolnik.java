import java.util.Scanner;
public class Triagolnik {

	public static void main(String[] args) {
	double a,b,c;
Scanner tastatura = new Scanner (System.in);
System.out.println("Vnesi vrednost za a");
   a=tastatura.nextDouble();
   b=tastatura.nextDouble();
   c=tastatura.nextDouble();
   
   if (a+b>c && a+c>b && b+c>a) {
	   System.out.println("So dadenite strani se formira triagolnik");
	   
 } else {
	   System.out.println("So dadenite strani ne se formira triagolnik");
	   System.exit(0);
   if (a*a+b*b==b*b || a*a+c*c==b*b || b*b+c*c==a*a) {
	   System.out.println("Triagolnikot e pravoagolen.");
 }
   else if (a*a+b*b<c*c || a*a+c*c<b*b || b*b+c*c<a*a) {
	   System.out.println("Triagolnikot e tapoagolen.");
 }
   else { 
	   System.out.println("Triagolnikot e ostroagolen.");
  }
       
  }
 }
}	