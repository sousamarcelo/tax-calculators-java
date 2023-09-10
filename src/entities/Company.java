package entities;

public class Company extends Taxpayer{
	private static final Double RATE1 = 16.0;
	private static final Double RATE2 = 14.0;
		
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if (getNumberOfEmployees() > 10.0) {
			return annualIncome * (RATE2/100);
		} else {
			return annualIncome * (RATE1/100);
		}		
	}
}
