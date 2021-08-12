import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Database {
	private Map<Id, Employee> db = new TreeMap<>();
	private File file = new File("database.txt");
	
	private void retrieve() throws FileNotFoundException {
		/*Loading from .txt file using a TreeMap. This method is called automatically when initiating 
		 *any changes.
		 */
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter(" ");
		Id id;
		Day birthDate, hireDate;
		Pay hourlyPay;
		Name name;
		Employee employee;
		while(scanner.hasNext()) {
			name = new Name(scanner.next(), scanner.next());
			id = new Id(scanner.next());
			birthDate = new Day(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()), 
					Integer.parseInt(scanner.next()));
			hireDate = new Day(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()), 
					Integer.parseInt(scanner.next()));
			hourlyPay = new Pay(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
			employee = new Employee(id, name, hourlyPay, birthDate, hireDate);
			db.put(id, employee);
		}		
	}
	private void autoSave() throws IOException {
		//defined such that any changes are automatically written to .txt file
		String s = "";
		Employee e;
		for(Map.Entry<Id, Employee> i: db.entrySet()) {
			e = i.getValue();
			s += e.getName() + " ";
			s += e.getID() + " ";
			s += e.getDateOfBirth().getMonth() + " " + e.getDateOfBirth().getDay() + " " + 
			e.getDateOfBirth().getYear() + " ";
			s += e.getStartDate().getMonth() + " " + e.getStartDate().getDay() + " " + 
			e.getStartDate().getYear() + " ";
			s += e.getPay().getDollars() + " " + e.getPay().getCents() + " ";
		}
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write(s);
		writer.close();
	}
	public void addEmployee(Employee e) throws Exception {
		retrieve();
		db.put(e.getID(), e);
		autoSave();
	}
	public void removeEmployee(Employee e) throws Exception {
		retrieve();
		db.remove(e.getID());
		autoSave();
	}
	public void listEmployees() throws Exception {
		retrieve();
		Employee e;
		System.out.format("%10s%26s%15s%20s%20s", "ID", "Full Name", "Pay Rate", 
				"Date of Birth", "Date of Hire");
		System.out.println();
		//displaying tree map in a table
		for(Map.Entry<Id, Employee> i: db.entrySet()) {
			e = i.getValue();
			System.out.format("%10s%26s%15s%20s%20s", e.getID(), e.getName(), e.getPay(), 
					e.getDateOfBirth(), e.getStartDate());
			System.out.println();
		}
	}
}
