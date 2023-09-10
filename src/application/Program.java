package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Taxpayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		List<Taxpayer> list = new ArrayList<Taxpayer>();
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.printf("Tax payer #%d data: %n", i);
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");	
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}			
		}
		
		System.out.println();
		
		double sum = 0.0;
		System.out.println("TAXES PAID:");
		for(Taxpayer taxpayer : list) {
			System.out.println(taxpayer.getName() + ": $ " + String.format("%.2f", taxpayer.tax()));
			sum += taxpayer.tax();
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();

	}

}
