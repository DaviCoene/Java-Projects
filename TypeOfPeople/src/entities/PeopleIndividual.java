package entities;

public class PeopleIndividual extends People {
	private double healthExpenditures;
	public PeopleIndividual() {
		super();
	}
	public PeopleIndividual(String name, Double income, double healthExpenditures) {
		super(name, income);
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double tax() {
		
		if (super.getIncome() > 20000) {
			return (super.getIncome() * 0.25) - (healthExpenditures * 0.5);
		}
		else {
			return (super.getIncome() * 0.15) - (healthExpenditures * 0.5);
		}
		
	}
	
}
