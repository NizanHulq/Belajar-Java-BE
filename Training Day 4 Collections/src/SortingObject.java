import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
				new Person("nizan",20),
				new Person("Budi",40),
				new Person("Charlie",22),
				new Person("Mamang",90),
				new Person("Puth",11)
				);
		
		List<Person> sortedPeople = people.stream()
				.sorted(Comparator.comparing(person->person.age))
				.collect(Collectors.toList());
		
		System.out.println(sortedPeople);
	}

}
