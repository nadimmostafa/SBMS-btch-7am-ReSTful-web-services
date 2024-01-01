package org.nadim.serviceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.nadim.repository.Repository;
import org.nadim.service.Service;

// to active JUnit with mockito

@ExtendWith(MockitoExtension.class)
public class ServiceTest {
	
	@Mock
	private Repository rep;
	
	@InjectMocks
	private Service ser;
	
	@Test
	public void testSuccess() {
		//Repository dummy implementation with mockito
		when(rep.getData()).thenReturn(Arrays.asList("Hi","Nadim","Naim","hlw"));
		
		
		//Test using Junit
		List<String> list = ser.getDataByLength();
		assertNotNull(list);
		assertEquals(3, list.size());
		
	}
}
