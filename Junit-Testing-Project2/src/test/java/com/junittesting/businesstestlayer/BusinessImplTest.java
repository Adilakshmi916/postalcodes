package com.junittesting.businesstestlayer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junittesting.businesslayer.BusinessImpl;

class BusinessImplTest {

	@Test
	void calculateSum_basic() {
		BusinessImpl business=new BusinessImpl();
		int actualValue=business.calculateSum(new int[] {1,2,3});
		int expectValue=6;
		assertEquals(expectValue,actualValue);
		
	}
	@Test
	void calculateSum_empty() {
		BusinessImpl business=new BusinessImpl();
		int actualValue=business.calculateSum(new int[] {});
		int expectValue=0;
		assertEquals(expectValue,actualValue);
		

}
}
