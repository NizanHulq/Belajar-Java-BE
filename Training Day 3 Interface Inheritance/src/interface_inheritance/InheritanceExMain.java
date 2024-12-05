package interface_inheritance;

public class InheritanceExMain {
	public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5);
        dog.makan(); // Memanggil method dari superclass
        dog.tidur(); // Memanggil method protected dari superclass
        dog.menggonggong();// Memanggil method milik Dog
        dog.suara();

        Cat cat = new Cat("Whiskers", 3);
        cat.makan();
        cat.tidur();
        cat.mengeong();
        cat.suara();
    }
}
