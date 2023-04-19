package com.junittesting.usingmockito;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.junittesting.businesslayer.BusinessImpl;
import com.junittesting.somedataservice.SomeDataService;

@ExtendWith(MockitoExtension.class)
public class BusinessImplUsingMockito {
	
	@InjectMocks
	BusinessImpl business;
	@Mock
	SomeDataService dataServiceMock;
	@BeforeEach
	public void before() {
		business.setSomeDataService(dataServiceMock);
	}
	@Test
	void calculateSumDataService_Basic() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {1,2,3,4});
		assertEquals(10,business.calculateSumDataService());
		
		}
		private void assertEquals(int i, int calculateSumDataService) {
		// TODO Auto-generated method stub
		
	}
		@Test
		void calculateSumDataService_Empty() {
			when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
			assertEquals(0,business.calculateSumDataService());
			
			}
}
	
		
		

