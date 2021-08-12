
public class Id extends Employee implements Comparable<Id> {
	private String id;
	public Id(String id) {
		this.id = id;
	}
	public String toString() {
		return id;
	}
	@Override
	public int hashCode() {
		return Integer.parseInt(id);
	}
	@Override
	public int compareTo(Id id) {
		int first = this.hashCode(), second = id.hashCode();
		return first - second;
	}
}
