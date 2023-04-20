package com.junittesting.businesstestlayer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.junittesting.businesslayer.BusinessImpl;

public class BusinessImplTest {

	@Test
	public void calculateSum_basic() {
		BusinessImpl business=new BusinessImpl();
		int actualValue=business.calculateSum(new int[] {1,2,3});
		int expectValue=6;
		assertEquals(expectValue,actualValue);
		
	}
	@Test
	public void calculateSum_empty() {
		BusinessImpl business=new BusinessImpl();
		int actualValue=business.calculateSum(new int[] {});
		int expectValue=0;
		assertEquals(expectValue,actualValue);
		

}
}
