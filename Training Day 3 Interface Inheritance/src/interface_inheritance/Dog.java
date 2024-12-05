package interface_inheritance;

public class Dog extends Animal implements Eatable, Playable {
	public Dog(String nama, int umur) {
        super(nama, umur); // Memanggil constructor superclass
    }

    public void menggonggong() {
        System.out.println(nama + " menggonggong.");
    }
    
    @Override
    public void makan() {
    	System.out.println(nama + " sedang makan makanan anjing.");
    }
    
    @Override
    public void bermain() {
        System.out.println(nama + " bermain dengan bola.");
    }
    
    @Override
    protected void suara() { // Override metode protected
        System.out.println(nama + " menggonggong dengan keras.");
    }
}
