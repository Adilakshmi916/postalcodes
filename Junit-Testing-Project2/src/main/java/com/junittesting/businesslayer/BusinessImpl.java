package com.junittesting.businesslayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessImpl {
	
	@Autowired
	private SomeDataServiceImpl someDataServiceImpl;
	
//	public void setSomeDataServiceImpl(SomeDataServiceImpl someDataServiceImpl) {
//		this.someDataServiceImpl = someDataServiceImpl;
//	}

	public int calculateSum(int[] data) {
		int sum=0;
		for(int i:data) {
			sum=sum+i;
		}
		return sum;
	}
	public int calculateSumDataService() {
		int sum=0;
		int[] data=someDataServiceImpl.retriveAllData();
		for(int i:data) {
			sum=sum+i;
		}
		return sum;
}
}
