import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>(); // struktur dinamis dapat berubah panjangnya
        names.add("Alipeee");
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // Duplikat diperbolehkan

        for (String name : names) {
            System.out.println(name);
        }
    }
}


