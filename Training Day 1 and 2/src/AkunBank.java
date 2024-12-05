
public class AkunBank {
	private double saldo; // Private variable

    public AkunBank(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public void setoran(double jumlah) { // Public method
        saldo += jumlah;
        System.out.println("Setoran berhasil. Saldo sekarang: " + saldo);
    }

    public void cekSaldo() { // Public method
        System.out.println("Saldo Anda: " + saldo);
    }

    private double metodeRahasia() { // Private method hanya bisa di akses di class
        return saldo*10/100;
    }
    
    public void returnMetodeRahasia() {
    	double hasil = metodeRahasia();
    	System.out.println("10% Saldomu : "+hasil);
    }
}
