package com.test.Mockito;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;  

public class ToDoBusinessMock {
@Test
public void testusing_Mocks()
{
	ToDoService doService=mock(ToDoService.class);
	List <String> combinedlist=Arrays.asList("Use Core","Use Spring Core","Use Hibernate");
	when(doService.getTodos("dummy")).thenReturn(combinedlist);
	ToDoBusiness business=new ToDoBusiness(doService);
	List <String> alltd=business.getTodosforHibernate("dummy");
	System.out.println(alltd);
	assertEquals(1, alltd.size());
}
}
