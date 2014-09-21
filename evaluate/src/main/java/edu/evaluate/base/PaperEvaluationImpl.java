/**
 * 
 */
package edu.evaluate.base;



import org.springframework.beans.factory.annotation.Autowired;
import edu.evaluate.base.evaluator.Evaluator;



/**
 * @author Nazmul.Hassan
 *
 */
public class PaperEvaluationImpl implements PaperEvaluation{
	
	@Autowired
	private Evaluator evaluator;
	
	public void result() {
		System.out.println("**************  PAPER EVALUATION of Matehmatics **************");
		String result = evaluator.evaluation(61);
		System.out.println(result);
	}

	
}
