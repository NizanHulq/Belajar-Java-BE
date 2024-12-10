import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
//			BufferedReader reader = new BufferedReader(new FileReader("D:/Backend-Training/Notingit/Training Day 5 Exception/src/Catatan"));
//			BufferedReader reader = new BufferedReader(new FileReader("src/Catatan"));
			BufferedReader reader = new BufferedReader(new FileReader("/Catatan"));
			System.out.println(reader.readLine());
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("File tidak ditemukan: " + e.getMessage());
		}

	}

}
