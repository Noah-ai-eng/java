
import java.util.Scanner;
public class answerss {
    public static double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Interest Calculator");
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();
        
        System.out.println("Simple Interest: " + simpleInterest(principal, rate, time));
        
        scanner.close();
    }
}

