/**
 * 
 */
package edu.evaluate.base.evaluator;



/**
 * @author Nazmul.Hassan
 *
 */

public class DefaultEvaluatorImpl implements Evaluator {

	/* (non-Javadoc)
	 * @see edu.evaluate.base.evaluator.Evaluator#evaluation(int)
	 */
	public String evaluation(int marks) {
		if(marks > 60)
			return "Good";
		else
			return "Pass";
	}

}
