package com.junittesting.usingmockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.junittesting.businesslayer.BusinessImpl;
import com.junittesting.businesslayer.SomeDataServiceImpl;

//@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessImplUsingMockito {
	
	@InjectMocks
	BusinessImpl business;
	@Mock
	SomeDataServiceImpl someDataServiceImpl;
	@Before
	public void before() {
		
	}
	@Test
	public void calculateSumDataService_Basic() {
		Mockito.when(someDataServiceImpl.retriveAllData()).thenReturn(new int[] {1,2,3,4});
		assertEquals(10,business.calculateSumDataService());
		
		}

		@Test
		public void calculateSumDataService_Empty() {
			when(someDataServiceImpl.retriveAllData()).thenReturn(new int[] {});
			assertEquals(0,business.calculateSumDataService());
			
		}
}
	
		
		

