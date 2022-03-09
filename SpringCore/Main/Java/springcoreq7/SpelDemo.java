package springcoreq7;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionParser parser = new SpelExpressionParser();  
		  
		org.springframework.expression.Expression exp =  parser.parseExpression("'Hello SPEL'");  
		String message =  (String) exp.getValue();  
		System.out.println(message);  
	}

}
