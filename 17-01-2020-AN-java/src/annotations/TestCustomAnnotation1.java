package annotations;

import java.lang.reflect.Method;

public class TestCustomAnnotation1 {
	  
	public static void main(String args[])throws Exception{  
		
		MyAnnotation annotation = Hello.class.getAnnotation(MyAnnotation.class);
		
		Hello h1=new Hello();
		Method m1=h1.getClass().getMethod("display");
		MyAnnotation methodannotation = m1.getAnnotation(MyAnnotation.class);
		System.out.println("Class Annotations");
	    System.out.println("name: " + annotation.name());
	    System.out.println("value: " + annotation.value());
	    System.out.println("Method Annotations");
	    System.out.println("name: " + methodannotation.name());
	    System.out.println("value: " + methodannotation.value());
	    
		
	}
}
