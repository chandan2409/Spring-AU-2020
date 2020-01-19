package lambda;
import lambda.triconsumerinterface;

public class triconsumer {

	public static void main(String[] args) {
		triconsumerinterface<Integer, Integer,Integer> tri2 = (a,b,c)  -> System.out.println(a + b + c);
		tri2.accept(1,2,3); //prints 6
		}

}
