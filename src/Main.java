import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float num1 = scanner.nextFloat();
        if (num1 > 0){
            System.out.println("Number is positive");
        } else if (num1 < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is 0");
        }
    }
}
