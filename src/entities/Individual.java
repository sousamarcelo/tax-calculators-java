package entities;

public class Individual extends Taxpayer{
	public static final Double RATE1 = 0.15;
	public static final Double RATE2 = 0.25;
	
	private Double healthExpenditures;
	
	public Individual() {
		// TODO Auto-generated constructor stub
	}	

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax(Double annualIncome) {
		if (annualIncome < 2000.0) {
			return annualIncome += (annualIncome * RATE1) + (getHealthExpenditures() * 0.50);
		} else {
			return annualIncome += (annualIncome * RATE2) + (getHealthExpenditures() * 0.50);
		}		
	}
}
