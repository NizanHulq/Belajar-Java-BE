package interface_inheritance;

public class Animal {
	protected String nama; // Protected variable
    protected int umur;

    public Animal(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    protected void tidur() { // Protected method
        System.out.println(nama + " sedang tidur.");
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
    
    protected void suara() {
    	System.out.println(nama + " mengeluarkan suara.");
    }
}
