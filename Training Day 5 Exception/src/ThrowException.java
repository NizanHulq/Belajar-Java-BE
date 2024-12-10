
public class ThrowException {
	// ex untuk validasi input seperti usia dsb

	public static void validateAge(int age) throws IllegalArgumentException{
		if (age < 18) {
			throw new IllegalArgumentException("Anda belum tua silahkan coba tahun depan!");
		} else {
			System.out.print("Selamat anda sudah Dewasa");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            validateAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
	}

}
