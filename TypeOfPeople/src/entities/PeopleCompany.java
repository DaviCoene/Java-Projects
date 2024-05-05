package entities;

public class PeopleCompany extends People {
	private Integer numberOfEmployee;
	
	public PeopleCompany() {
		
	}

	public PeopleCompany(String name, Double income, Integer numberOfEmployee) {
		super(name, income);
		this.numberOfEmployee = numberOfEmployee;
	}
	
	@Override
	public double tax() {
		if (numberOfEmployee > 10) {
			return super.getIncome() * 0.14;
		}
		else {
			return super.getIncome() * 0.16;
		}
	}
	
}
