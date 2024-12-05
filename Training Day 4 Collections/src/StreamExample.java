import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<String> names = Arrays.asList("Alice","Booob","Sadinoo");
		
		// Stream Mapping
		List<Integer> squares = numbers.stream().map(num -> num*num).collect(Collectors.toList());
		System.out.println(squares);
		
		//Stream Filtering
		numbers.stream().filter(num->num%2 == 0).forEach(System.out::println);
		
		// Stream Foreach
		names.stream().forEach(name-> System.out.println("Hello kawan "+name));
		
		
		
	}

}
