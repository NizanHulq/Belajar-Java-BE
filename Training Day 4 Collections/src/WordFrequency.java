
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {

	public static void main(String[] args) {
		// Ini coba kasus menghitung banyaknya kata kata yang muncul berulang pada koleksi
		List<String> words = Arrays.asList("apple", "banana", "apple", "orange","orange","orange","orange","orange","orange","orange", "banana", "apple");
		
		Map<String, Long> frequency = words.stream()
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		System.out.println(frequency);
	}

}
