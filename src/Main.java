import java.util.Random;
import java.util.Scanner;


public class Main {

    public static final double ANNUAL_INTEREST_RATE = 3.75;
    public static final double MAX = 10;

    public static void main(String[] args) {

        double monthlyInterestRate = ANNUAL_INTEREST_RATE / 12;

        System.out.println(" Enter your monthly savings amount: ");
        Scanner scanner = new Scanner(System.in);
        double monthlySavingsAmount = scanner.nextInt();

        String counterName;
        double savedToDate = 0;
        counterName = " ";

        for (int i = 1; i <= MAX; i++){
            switch(i){
                case 1: counterName = "first"; break;
                case 2: counterName = "second"; break;
                case 3: counterName = "third"; break;
                case 4: counterName = "fourth"; break;
                case 5: counterName = "fifth"; break;
                case 6: counterName = "sixth"; break;
                default: counterName = " next";

            }
            System.out.print(" After the " + counterName + " month, the value in the account value is ");


            double savedAmount = (monthlySavingsAmount + savedToDate) * ( 1 + monthlyInterestRate / 100);
            savedToDate = savedAmount;
            System.out.println(savedToDate);
        }

    }
}