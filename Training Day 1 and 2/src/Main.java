/**
 * 
 */

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	int x = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Belajar Class dan Object
		Main classdalam = new Main();
		Classbaru classsebelah = new Classbaru();
		System.out.println(classdalam.x);
		System.out.println(classsebelah.x);
		System.out.println(classsebelah.y);
		classsebelah.tampil();
		// Belajar Constructor
		Buku buku1 = new Buku("Amaang Siantar","Mamang Kasbor");
		buku1.menampilkan();
		// Belajar Access Modifier
		AkunBank akun = new AkunBank(1000);
        akun.setoran(500);
        akun.cekSaldo();
        akun.returnMetodeRahasia();
        
        // Belajar Pass by Value dan Pass by Reference
        
        
        // Belajar Static variable dan Method
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c3.tampilkanHitungan();
        
     // Memanggil static method tanpa membuat objek
        double luas = MathUtils.luasLingkaran(111);
        System.out.println("Luas lingkaran: " + luas);
	}

}
