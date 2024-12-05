import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	public static void main(String[] args) {
//		Set<String> names = new HashSet<>(); // tidak mungkin ada elemen yang duplikat
//		names.add("Mamamng");
//		names.add("Alice");
//		names.add("Boob sadino");
//		names.add("Mamamng");
//		names.add("Mamamng");
//		names.add("Kasbor");
		Set<Integer> names = new TreeSet();
		names.add(22);
		names.add(55);
		names.add(44);
		names.add(99);
		names.add(44);
		names.add(21);
		System.out.print(names);
//		for (int name : names) {
//	        System.out.println(name);
//	    }
	}
}
