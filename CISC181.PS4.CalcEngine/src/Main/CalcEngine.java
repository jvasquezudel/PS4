package Main;

public class CalcEngine {
	
	public double FutureValue(double PV, double Years, double AnnualRate){
	
		double Rate = (1 + AnnualRate/100);
		
		double Interest = Math.pow(Rate, Years);
		
		double FV = PV * Interest;
		
		return FV;
		
	}
	
	
}
