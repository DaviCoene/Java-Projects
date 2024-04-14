package entities;

public class Employee {

	private int _id;
	private String _Name;
	private double _salary;
	
	Employee(){
		
	}

	public Employee(int _id, String _Name, double _salary) {
		this._id = _id;
		this._Name = _Name;
		this._salary = _salary;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_Name() {
		return _Name;
	}

	public void set_Name(String _Name) {
		this._Name = _Name;
	}

	public double get_salary() {
		return _salary;
	}

	public void set_salary(double _salary) {
		this._salary = _salary;
	}
	
	public void increaseSalary(double percentage) {
		_salary = _salary + _salary * percentage / 100;
	}

	@Override
	public String toString() {
		return _id+ ", "  + _Name +", "  +  _salary ;
	}
	
	
}