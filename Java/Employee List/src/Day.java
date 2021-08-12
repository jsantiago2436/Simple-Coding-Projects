
public class Day extends Employee {
	private Integer month, day, year;
	public Day(Integer month, Integer day, Integer year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public String toString() {
		return Integer.toString(month) + "/" + Integer.toString(day) + "/" + 
				Integer.toString(year);
	}
	public Integer getMonth() {
		return month;
	}
	public Integer getDay() {
		return day;
	}
	public Integer getYear() {
		return year;
	}
}