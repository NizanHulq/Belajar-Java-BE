
public class RuntimeExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Kesalahan runtime
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks tidak valid: " + e.getMessage());
        }
//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[5]); // Kesalahan runtime
	}

}
