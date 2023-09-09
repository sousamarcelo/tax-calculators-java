package entities;

public class Individual extends Taxpayer{
	public static final Double RATE1 = 15.0;
	public static final Double RATE2 = 25.0;
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
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
	public Double tax() {
		if (annualIncome < 2000.0) {
			return annualIncome * (1 + RATE1/100) + (getHealthExpenditures() * 0.50);
		} else {
			return annualIncome * (1 + RATE2/100) + (getHealthExpenditures() * 0.50);
		}		
	}
}
