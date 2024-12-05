import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> ages = new HashMap<String, Integer>(); // key value kaya dictionary / object di javascript
		ages.put("Mamang", 23);
		ages.put("Bob", 24);
		ages.put("Sida", 10);

		for (Map.Entry<String, Integer> entry : ages.entrySet()) {
			System.out.println(entry.getKey() + " berusia " + entry.getValue());
		}
	}

}
