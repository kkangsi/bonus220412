package bonus220412;

import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter name : ");
		String name = input.nextLine();

		System.out.println("Enter hour : ");
		double hours = input.nextDouble();
		
		Employee empTest = new Employee(name, hours);
		
		empTest.setTotalPay(hours);
		String resultMessage = empTest.toString();
		System.out.println(resultMessage);
		
	}
}
