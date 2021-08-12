public class Pay extends Employee {
	private Integer dollars, cents;
	public Pay(Integer dollars, Integer cents) {
		this.dollars = dollars;
		this.cents = cents;
	}
	@Override
	public String toString() {
		String stringCents = "";
		try {
			if(cents < 10) stringCents += "0";
			else if(cents > 99) throw new Exception();
			stringCents += Integer.toString(cents);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return "$" + Integer.toString(dollars) + "." + stringCents;
	}
	
	public Integer getDollars() {
		return dollars;
	}
	public Integer getCents() {
		return cents;
	}
}