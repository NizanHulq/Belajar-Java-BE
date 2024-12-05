
public class PassByReference {
	public static void ubahNama(Mahasiswa mahasiswa) {
        mahasiswa.nama = "Nama Baru"; // Mengubah properti objek
        System.out.println("Nama di dalam metod: " + mahasiswa.nama);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Nama Lama");
        System.out.println("Nama sebelum metod dipanggil: " + mahasiswa1.nama);
        ubahNama(mahasiswa1);
        System.out.println("Nama setelah metod dipanggil: " + mahasiswa1.nama); // Berubah
    }
}
