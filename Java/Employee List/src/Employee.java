public class Employee extends Database {
	private Id id;
	private Name name;
	private Pay hourlyPay;
	private Day dateOfBirth;
	private Day startDate;
	
	public Employee(Id id, Name name, Pay hourlyPay, Day dateOfBirth, Day startDate) {
		this.id = id;
		this.name = name;
		this.hourlyPay = hourlyPay;
		this.dateOfBirth = dateOfBirth;
		this.startDate = startDate;
	}
	public Employee() {
		//default constructor
	}
	
	public Name getName() {
		return name;
	}
	public Id getID() {
		return id;
	}
	public Pay getPay() {
		return hourlyPay;
	}
	public Day getDateOfBirth() {
		return dateOfBirth;
	}
	public Day getStartDate() {
		return startDate;
	}
}
