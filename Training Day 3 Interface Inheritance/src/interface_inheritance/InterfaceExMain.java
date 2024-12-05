package interface_inheritance;

public class InterfaceExMain {
	public static void main(String[] args) {
        Dog dog = new Dog("Buddy",2);
        dog.makan();
        dog.bermain();

        Cat cat = new Cat("Whiskers",4);
        cat.makan();
        cat.bermain();
    }
}
