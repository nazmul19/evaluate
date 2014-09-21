import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.evaluate.base.PaperEvaluation;


public class TestEvaluation {

	public static void main(String[] args) {
		System.out.println("************ START  ********************");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PaperEvaluation evl = (PaperEvaluation) ctx.getBean("paperEvaluation");
		evl.result();
		System.out.println("************ END ********************");
	}

}
