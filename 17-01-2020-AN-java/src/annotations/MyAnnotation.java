package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.TYPE,ElementType.METHOD}) 
public @interface MyAnnotation {
	String   value() default "";

    String   name();
    int      age();
    String[] newNames();
}
@MyAnnotation(
	    value="123",
	    name="Jakob",
	    age=37,
	    newNames={"Jenkov", "Peterson"}
	)

class Hello{ 
	
	@MyAnnotation(
		    value="456",
		    name="chandan",
		    age=37,
		    newNames={"Jenkov", "Peterson"}
		)
	public void display()
	{
		
	}
	

}

