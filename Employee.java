package bonus220412;
import java.util.Scanner;

public class Employee {
	
	String name;
	double hours;
	
	final double hourlyRate = 15.0;
	final double overtimeHourlyRate = 16.5;
	
	double totalPay;
	
	public Employee (String name, double hours) {
		this.name = name;
		this.hours = hours;
		
		setTotalPay(hours);
	}
	
	public void setTotalPay(double hours) {
		double totalPay = 0;
		
		if (hours <= 40) {
			totalPay = hours * hourlyRate;
		} else if (hours > 40) {
			totalPay = ((hours - 40) * overtimeHourlyRate) + (40 * hourlyRate);
		}
		
		this.totalPay = totalPay;
	}
	
	public double getTotalPay() {
		return totalPay;
	}
	
	
	String resultMessage = null;
	@Override
	public String toString() {
		
		resultMessage = "\nName : " + name + " \nHour : " + hours +
				"\nTotal wage : " + totalPay + "\n";
		
		return resultMessage;		
	}
}
