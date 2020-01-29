package com.test.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	
   @InjectMocks 
   MathApplication mathApplication = new MathApplication();

   @Mock
   CalculatorService calcService;

   @Test
   public void testAdd(){
      //add the behavior of calc service to add two numbers
      when(calcService.add(10.0,20.0)).thenReturn(30.00);
      when(calcService.subtract(20.0,10.0)).thenReturn(10.0);

      when(calcService.multiply(20.0,10.0)).thenReturn(200.0);
      when(calcService.divide(30.0,20.0)).thenReturn(1.5);

      //test the add functionality
      Assert.assertEquals(calcService.add(10.0, 20.0),30.0,0);
      Assert.assertEquals(calcService.subtract(20.0, 10.0),10.0,0);
      Assert.assertEquals(calcService.multiply(20.0, 10.0),200.0,0);
      Assert.assertEquals(calcService.divide(30.0, 20.0),1.5,0);
      
      InOrder inOrder = inOrder(calcService);
      
      inOrder.verify(calcService).add(10.0,20.0);
      inOrder.verify(calcService).subtract(20.0,10.0);
      inOrder.verify(calcService).multiply(20.0,10.0);
      inOrder.verify(calcService).divide(30.0,20.0);

      //verify(calcService, times(3)).add(10.0, 20.0);

/*      //verify the behavior
      verify(calcService).add(10.0, 20.0);
      verify(calcService).subtract(10.0, 20.0);*/
   }
}
