
public class PassByValue {
	public static void ubahNilai(int angka) {
        angka = angka + 10; // Perubahan hanya pada salinan
        System.out.println("Nilai di dalam metode: " + angka);
    }

    public static void main(String[] args) {
        int nilai = 50;
        System.out.println("Nilai sebelum metode dipanggil: " + nilai);
        ubahNilai(nilai);
        System.out.println("Nilai setelah metode dipanggil: " + nilai); // Tidak berubah
    }
}
