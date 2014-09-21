/**
 * 
 */
package edu.evaluate.ext;

import edu.evaluate.base.evaluator.Evaluator;

/**
 * @author Nazmul.Hassan
 *
 */
public class CustomEvaluationImpl implements Evaluator{

	public String evaluation(int marks) {
		if(marks > 70)
			return "Very Good";
		else
			return "Fail";
	}

}
