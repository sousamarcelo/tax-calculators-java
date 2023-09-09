package entities;

public class Company extends Taxpayer{
	private static final Double RATE1 = 0.16;
	private static final Double RATE2 = 0.14;
		
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
		if (getNumberOfEmployees() > 10) {
			return annualIncome * (1 + RATE2/100);
		} else {
			return annualIncome * (1 + RATE1/100);
		}		
	}
}
