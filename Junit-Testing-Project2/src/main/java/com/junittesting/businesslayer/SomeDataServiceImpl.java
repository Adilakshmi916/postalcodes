package com.junittesting.businesslayer;

import org.springframework.stereotype.Service;

import com.junittesting.somedataservice.SomeDataService;

@Service
public class SomeDataServiceImpl implements SomeDataService{

	public int[] retriveAllData() {
		return new int[] {1,2,3,4,5};
	}

}
