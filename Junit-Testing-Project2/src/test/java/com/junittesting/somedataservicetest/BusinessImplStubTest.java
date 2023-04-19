package com.junittesting.somedataservicetest;

import org.junit.jupiter.api.Test;

import com.junittesting.businesslayer.BusinessImpl;
import com.junittesting.somedataservice.SomeDataService;

class SomeDataServiceImpl implements SomeDataService {
	public int [] retriveAllData() {
		return new int[] {1,2,3,4};
	}
}
	class SomeDataServiceEmptyImpl implements SomeDataService {
		public int [] retriveAllData() {
			return new int[] {};
		}

}
public class BusinessImplStubTest{
	@Test
	void calculateSumDataService_Basic() {
		BusinessImpl business=new BusinessImpl();
		business.setSomeDataService(new SomeDataServiceImpl());
		int actualValue=business.calculateSumDataService();
		int expectedValue=10;
		assertEquals(expectedValue,actualValue);
		
	}

	private void assertEquals(int expectedValue, int actualValue) {
		// TODO Auto-generated method stub
		
	}
	@Test
	void calculateSumDataService_Empty() {
		BusinessImpl business=new BusinessImpl();
		business.setSomeDataService(new SomeDataServiceEmptyImpl());
		int actualValue=business.calculateSumDataService();
		int expectedValue=0;
		assertEquals(expectedValue,actualValue);
		
	}

	
}


