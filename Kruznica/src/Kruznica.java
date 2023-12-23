import java.util.Scanner;
public class Kruznica {
	public static void main(String[] args) {
    double radius, povrsina, perimetar;
    double pi = 3.14;
    Scanner tastatura = new Scanner(System.in);
    System.out.println("Ovaa programa presmetuva perimetar i plostina na kruznica");
    System.out.println("Vnesete go radiusot na kruznicata :");
    radius = tastatura.nextDouble();
    povrsina = radius*radius*pi;
    perimetar = 2*radius*pi;
    System.out.println();
	System.out.println("Perimetarot e: " + perimetar);
	System.out.println("Povrsinata e: " + povrsina);
	}
}