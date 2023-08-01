package program;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<TaxPayer> taxPayerList = new ArrayList<>();

        for (int i=1;i<=n;i++)
        {
            System.out.print("Tax payer #" + i + " data:\n");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();

            if (type == 'i' || type == 'I')
            {
                System.out.print("Health expenditure: ");
                Double healthExpenditures = sc.nextDouble();
                taxPayerList.add(new Individual(name, annualIncome, healthExpenditures));
            }
            else if (type == 'c' || type == 'C')
            {
                System.out.print("Number of employees: ");
                int employeeNumber = sc.nextInt();
                taxPayerList.add(new Company(name, annualIncome, employeeNumber));
            }
        }

        System.out.print("\nTAXES PAID:\n");
        for (TaxPayer taxPayer : taxPayerList)
        {
            System.out.print(taxPayer.toString());
        }
        double taxTotal = 0;

        for (TaxPayer taxPayer : taxPayerList)
        {
            taxTotal += taxPayer.tax();
        }

        System.out.print("\nTOTAL TAXES: $ " + String.format("%.2f\n", taxTotal));

    }
}