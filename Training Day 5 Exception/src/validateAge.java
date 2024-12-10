
public class validateAge {
	
	public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Usia harus minimal 18 tahun.");
        } else {
        	System.out.println("Selamat anda sudah tua ");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(17);
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Kesalahan: " + e.getMessage());
		}

	}

}
