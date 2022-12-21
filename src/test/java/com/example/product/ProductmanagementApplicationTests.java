package com.example.product;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductmanagementApplicationTests {
	
	Calculator c=new Calculator();

	@Test
	@Disabled
	void contextLoads() {
	}
	
	@Test
	void testSum() {
		//expected result
		int expectedResult=6;
		
		
		//actual
		int actualResult=c.doSum(1, 2, 3);
		
		assertThat(actualResult).isEqualTo(expectedResult);
		System.out.println("true");
		
		
	}
	
	@Test
	void testProduct() {
		//expected product
		int expectedProduct=12;
		
		//actual
		int actualProduct=c.doProduct(4, 3);
		
		assertThat(actualProduct).isEqualByComparingTo(expectedProduct);
		System.out.println("true");
	}
	//compare
	@Test
	void comapareTwoNumbers() {
	          Boolean actualResult=c.compareTwoNumbers(3, 3);
	          assertThat(actualResult).isTrue();
	}
	

}
