import java.io.*;
public class HandlingMultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// ini munculin exception
			String filename = null;
			System.out.print(filename.length());
			
			// ini juga
			BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            System.out.println(reader.readLine());
		} catch (NullPointerException e) {
			// TODO: handle exception
			 System.out.println("Kesalahan: Nilai null tidak diperbolehkan.");
			
		} catch(IOException e) {
			System.out.println("Kesalahan I/O: " + e.getMessage());
		}
	}
	
	// urut ternyata tidak langsung di handle dua kesalahan terebut

}
