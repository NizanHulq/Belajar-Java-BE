import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupingPerson {

	public static void main(String[] args) {
		// TODO Ini adalah case ketika ingin mengelompokkan object berdasarkan umurnya
		List<Person> people = Arrays.asList(
	            new Person("Alice", 30),
	            new Person("Bob", 25),
	            new Person("Charlie", 25),
	            new Person("Puth", 25),
	            new Person("Mamang", 25),
	            new Person("Abangabangan", 25),
	            new Person("Siapapun", 30),
	            new Person("Charlie mendes", 40)
	        );
		Map<Integer, List<Person>> groupedPerson = people.stream()
				.collect(Collectors.groupingBy(person->person.age));
		System.out.println(groupedPerson);

	}

}

/**
 * stream map untuk melakukan operasi pada setiap elemen, dan berupa operator intermediate artinya
 * setelah map masih dapat dilakukan operator terminal seperti foreach atau collect. 
 */

/**
 * foreach adalah operator terminal yang digunakan untuk mengeluarkan suatu outpun ke console ataupun yang lain.
 * intinya ini final 
 */

/**
 * collect digunakan untuk membuat hasil olah data dari map 
 * ataupun yang lain di kumpulkan kedalam bentuk array, list ataupun sejenisnya.
 * Dan merupakan operator terminal atau sudah final.
 */