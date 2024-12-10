
/**
 * Pass by value adlah kita mengirimkan parameter dengan tipe data primitif ke dalam metod
 * dan tidak akan mengubah nilai variabel asli diluar metod.
 * 
 * Pass by reference adalah kita mengirimkan sebuah reference objek ke sebuah metod yg memodifikasi properti
 * maka properti objek sebenarnya akan berubah juga. karena masih satu reference object yang sama.
 * Tetapi sebenarnya reference object yang di passing adalah sebuah value (Jika di Java seperti itu).
 */
public class PassByExample {
	public static void ubahPrimitif(int angka) {
        angka = angka * 2; // Hanya mengubah salinan
    }

    public static void ubahObjek(Kotak kotak) {
        kotak.panjang = kotak.panjang * 2; // Mengubah properti objek
        kotak.lebar = kotak.lebar * 2;
    }

    public static void main(String[] args) {
        int nilai = 5;
        Kotak kotak1 = new Kotak(10, 20);

        System.out.println("Nilai sebelum ubahPrimitif: " + nilai);
        ubahPrimitif(nilai);
        System.out.println("Nilai setelah ubahPrimitif: " + nilai); // Tidak berubah

        System.out.println("Kotak sebelum ubahObjek: Panjang=" + kotak1.panjang + ", Lebar=" + kotak1.lebar);
        ubahObjek(kotak1);
        System.out.println("Kotak setelah ubahObjek: Panjang=" + kotak1.panjang + ", Lebar=" + kotak1.lebar); // Berubah
    }
}

