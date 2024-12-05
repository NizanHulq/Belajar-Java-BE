
public class Buku {
	String judul;
	String penulis;
	
	Buku(String judul, String penulis){
		this.judul = judul;
		this.penulis = penulis;
	}
	
	void menampilkan() {
		System.out.println("Juduuul : "+judul+", Penulis : "+penulis);
	}
}
