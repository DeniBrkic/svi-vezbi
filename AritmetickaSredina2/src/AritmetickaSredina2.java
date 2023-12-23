import java.util.Scanner;
public class AritmetickaSredina2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vnesete go brojot na broevi: ");
        int num_of_numbers = scanner.nextInt();
        double total_sum = 0;

        for (int i = 0; i < num_of_numbers; i++) {
            
        System.out.print("Vnesete broj #" + (i + 1) + ": ");
        double num = scanner.nextDouble();
        total_sum += num;
        }
        
        double average = total_sum / num_of_numbers;        
        System.out.println("Aritmetickata sredina na vnesenite broevi e: " + average);        
        scanner.close();
    }
}