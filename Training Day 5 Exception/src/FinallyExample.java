import java.io.*;

public class FinallyExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Kesalahan I/O: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Selalu menutup file
                    System.out.println("File ditutup.");
                }
            } catch (IOException e) {
                System.out.println("Kesalahan saat menutup file.");
            }
        }
    }
}