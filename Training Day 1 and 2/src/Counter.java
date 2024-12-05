
public class Counter {
	static int hitungan = 0; // Static variable untuk menghitung jumlah objek

    Counter() {
        hitungan++;
    }

    void tampilkanHitungan() {
        System.out.println("Jumlah objek: " + hitungan);
    }
}
