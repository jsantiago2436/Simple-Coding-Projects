
public class Name extends Employee {
	private String firstName;
	private String lastName;

	public Name(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	public String toString() {
		return firstName + " " + lastName;
	}
}
