
public class Pay extends Employee {
	private Integer dollars, cents;
	public Pay(Integer dollars, Integer cents) {
		this.dollars = dollars;
		this.cents = cents;
	}
	
	public String toString() throws Exception {
		String stringCents = "";
		if(cents < 10) stringCents += "0";
		else if(cents > 99) throw new Exception("Cents cannot be more than 2 digits");
		stringCents += Integer.toString(cents);
		return "$" + Integer.toString(dollars) + "." + stringCents;
	}
	public Integer getDollars() {
		return dollars;
	}
	public Integer getCents() {
		return cents;
	}
}
