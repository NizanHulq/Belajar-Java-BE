import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> queue = new LinkedList<>();

        
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        
        queue.addFirst("Zara");

        // Hapus pelanggan dari awal (yang dilayani)
        String served = queue.removeFirst();
        System.out.println("Pelanggan yang dilayani: " + served); // Output: Zara

        // Tampilkan sisa antrian
        System.out.println("Sisa antrian: " + queue); // Output: [Alice, Bob, Charlie]
	}

}
