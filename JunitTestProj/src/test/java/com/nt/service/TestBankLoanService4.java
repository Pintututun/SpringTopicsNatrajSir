package com.nt.service;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@DisplayName("TestingBankLoanService class")
@TestMethodOrder(value=OrderAnnotation.class)
public class TestBankLoanService4 {

	@Test
	@DisplayName("Testing with big numbers")
	@Order(2)
	public void testcalcSimpleInterestAmountWithBigNumbers() {
		BankLoanService service=new BankLoanService();
		float actual=service.calcSimpleInterestAmount(10000000,2,12);
		float expected=2400000.12f;//Through manual calculation
		Assertions.assertEquals(expected, actual); 
		//Assertions.assertEquals(expected, actual,"may be results not matching"); The userdefined message for not matching
		//Assertions.assertEquals(expected, actual,0.5,"may be results not matching"); 0.5 is the delta value-->It is the difference which is allowed 
	}
	@Test
	@DisplayName("Testing with small numbers")
	@Order(1)
	public void testcalcSimpleInterestAmountWithSmallNumbers() {
		BankLoanService service=new BankLoanService();
		float actual=service.calcSimpleInterestAmount(100000, 2, 12);
		float expected=24000.0f;//Through manual calculation
		Assertions.assertEquals(expected, actual); 
		//Assertions.assertEquals(expected, actual,"may be results not matching");  The userdefined message for not matching
		//Assertions.assertEquals(expected, actual,0.5,"may be results not matching"); 0.5 is the delta value-->It is the difference which is allowed
	}
	
	@Test
	@DisplayName("Testing with Invalid Inputs")
	public void testcalcSimpleInterestAmountWithInvalidInputs() {
		BankLoanService service=new BankLoanService();
		Assertions.assertThrows(IllegalArgumentException.class,
				()->{
					service.calcSimpleInterestAmount(0, 0, 0);
					},
				"may exception raised is not matching"
				);
	}
	
	@Test
	@Disabled
	@DisplayName("Testing with Timer out")
	@Order(0)
	public void testcalcSimpleInterestAmountWithTimer() {
		BankLoanService service=new BankLoanService();
		Assertions.assertTimeout(Duration.ofMillis(20000),
				()->{
					service.calcSimpleInterestAmount(10000000,2,12);
					},
				"may crossed the required time"
				);
	}
	
	@Test
	@DisplayName("Testing with No exception")
	@Order(-1)
	public void testcalcSimpleInterestAmountForNoExceptions() {
		BankLoanService service=new BankLoanService();
		Assertions.assertDoesNotThrow(()->{
			service.calcSimpleInterestAmount(10000, 2, 12);
		});
	}
	
}
