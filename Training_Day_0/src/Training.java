
public class Training {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int panjang = 25;
		double lebar = 22.49;
		
		System.out.println(panjang);
		System.out.println(lebar);
		
		// Menghitung Keliling
		System.out.println("====Menghitung Keliling");
		int sisi = 90;
		int keliling;
		keliling = 4*sisi;
		System.out.println("Keliling segi empat adalah "+keliling);
		
		// Belajar Operator
		System.out.println("====Belajar Operator");
		int a = 10, b = 20;

        // Operator aritmatika
        System.out.println("Penjumlahan: " + (a + b));
        System.out.println("Pengurangan: " + (a - b));
        System.out.println("Perkalian: " + (a * b));
        System.out.println("Pembagian: " + (b / a));

        // Operator relasi
        System.out.println("Apakah a == b? " + (a == b));
        System.out.println("Apakah a < b? " + (a < b));

        // Operator logika
        System.out.println("Apakah a < b dan b > 15? " + (a < b && b > 15));
        
        // Belajar Tipe data 
        System.out.println("====Tipe data general");
        int angka = 5; 
        double desimal = 3.14; 
        char huruf = 'A';
        boolean benar = true; 

        System.out.println("Integer: " + angka);
        System.out.println("Double: " + desimal);
        System.out.println("Char: " + huruf);
        System.out.println("Boolean: " + benar);
        
        //Belajar If else
        System.out.println("====If Else");
        int nilai = 85;

        if (nilai >= 90) {
            System.out.println("Grade: A");
        } else if (nilai >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
        
        // Belajar Switch case
        System.out.println("====Switch Case");
        int hari = 3; 

        switch (hari) {
            case 1:
                System.out.println("Hari ini adalah Senin");
                break; // Mengakhiri blok case
            case 2:
                System.out.println("Hari ini adalah Selasa");
                break;
            case 3:
                System.out.println("Hari ini adalah Rabu");
                break;
            case 4:
                System.out.println("Hari ini adalah Kamis");
                break;
            case 5:
                System.out.println("Hari ini adalah Jumat");
                break;
            case 6:
                System.out.println("Hari ini adalah Sabtu");
                break;
            case 7:
                System.out.println("Hari ini adalah Minggu");
                break;
            default:
                System.out.println("Hari tidak valid");
                break;
        }
        // Belajar For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i +" dari For Loop");
        }
        // Belajar While
        int i = 1;

        while (i <= 5) {
            System.out.println("Perulangan ke-" + i +" dari While");
            i++;
        }
        // Belajar do While
        int l = 1;

        do {
            System.out.println("Perulangan ke-" + l +" dari do While");
            l++;
        } while (l <= 5);
	}
}
