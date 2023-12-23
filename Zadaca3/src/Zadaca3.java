import java.util.Scanner;
public class Zadaca3 {

	public static void main(String[] args) {
  int x=1,y=1,z=1;
  if (x>y||z>y)
	  System.out.println("1");
  else 
	  System.out.println("2");
  if (Math.abs(x-y)>=z)
	  if (x>y)
		  System.out.println("3");
	  else
		  System.out.println("4");
  else
	  System.out.println("5");
  
	}

}