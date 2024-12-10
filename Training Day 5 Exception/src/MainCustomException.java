
public class MainCustomException {

	public static void checkBalance(double balance, double withdraw) throws InsufficitionBalanceCustomEx{
		if (withdraw > balance) {
			throw new InsufficitionBalanceCustomEx("Saldo anda tidak cukup. Silahkan bekerja kembali!!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance = 5000;
		double withdraw = 10000;
		
		try {
			checkBalance(balance, withdraw);
		} catch (InsufficitionBalanceCustomEx e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
	}

}
