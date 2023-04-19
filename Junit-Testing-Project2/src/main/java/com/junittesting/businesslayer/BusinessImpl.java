package com.junittesting.businesslayer;

import com.junittesting.somedataservice.SomeDataService;

public class BusinessImpl {
	
	private SomeDataService someDataService;
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		int sum=0;
		for(int i:data) {
			sum=sum+i;
		}
		return sum;
	}
	public int calculateSumDataService() {
		int sum=0;
		int[] data=someDataService.retriveAllData();
		for(int i:data) {
			sum=sum+i;
		}
		return sum;
}
}
