package app;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * QueueChallenge
 */
public class QueueChallenge {

    private Queue<Double> queue;
    private final int MONTHS = 12;
    private double homeValue, downPayment, interestRate, monthlyPrinciple;


    //Instantiate all the class fields/variables
    public QueueChallenge() {
        queue = new LinkedList<Double>();
        getInput();
    }

    private void getInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Monthly Payment Queue - Enter Values...\n");

        System.out.println("Enter home value: ");
        this.homeValue = scan.nextDouble();

        System.out.println("Enter downPayment value: ");
        this.downPayment = scan.nextDouble();

        System.out.println("Enter interest rate (decimal) value: ");
        this.interestRate = scan.nextDouble();

        System.out.println("Enter monthly principle value: ");
        this.monthlyPrinciple = scan.nextDouble();

        scan.close();
    }

    public void caclulateAndStore() {
        double loanAmount = this.homeValue - this.downPayment;

        for (int i = 0; i < this.MONTHS; i++) {
            double interest = loanAmount*this.interestRate/12.0;
            double monthlyPayment = interest + this.monthlyPrinciple;
            loanAmount = loanAmount - monthlyPayment;

            queue.add(monthlyPayment);
        }

    }


    public void clearAndPrintMonthlyValues() {
        while(!this.queue.isEmpty()) {
            System.out.println(this.queue.poll());
        }
    }



    public static void main(String[] args) {
        QueueChallenge mortgage = new QueueChallenge();
        mortgage.caclulateAndStore();
        mortgage.clearAndPrintMonthlyValues();    
    }


}