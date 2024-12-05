package interface_inheritance;

public class Cat extends Animal implements Eatable, Playable {
	public Cat(String nama, int umur) {
        super(nama, umur);
    }

    public void mengeong() {
        System.out.println(nama + " mengeong.");
    }
    @Override
    public void makan() {
        System.out.println(nama + " sedang makan ikan.");
    }

    @Override
    public void bermain() {
        System.out.println(nama + " bermain dengan tali.");
    }
    
    @Override
    protected void suara() {
        System.out.println(nama + " mengeong dengan lembut.");
    }
}
