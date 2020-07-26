/**
 * 
 */
package interestCalculator;

/**
 * @author Vishwanath Reddy
 *
 */
public class CompoundInterest {

	public double CompoundInterestCalculator(int principle, int compoundedPerUnit, int time, double rate) {
		// TODO Auto-generated method stub
		return (principle * Math.pow(1 + (rate / compoundedPerUnit), compoundedPerUnit * time)) - principle;
	}

	
}
