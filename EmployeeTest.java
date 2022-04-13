package bonus220412;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {


	@Test
	void testTotalPay() {
		Employee empTest1 = new Employee("kang under 40 hours", 30);
		assertEquals(450, empTest1.getTotalPay());
	
		Employee empTest2 = new Employee("kang over 40 hours", 42);	
		assertEquals(633, empTest2.getTotalPay(), 0.01);
		
		
	}

}
