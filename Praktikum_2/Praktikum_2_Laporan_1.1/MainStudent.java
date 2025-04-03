import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt(); input.nextLine();

        Student[] Siswa = new Student[jumlahSiswa];

        int i = 0, j =0;
        for (  ; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1));

            System.out.print("Masukkan nama: ");
            String name = input.nextLine();

            System.out.print("Masukkan alamat: ");
            String address = input.nextLine();

            System.out.print("Masukkan umur: ");
            int age = input.nextInt(); input.nextLine();

            System.out.print("Masukkan nilai math: ");
            double math = input.nextDouble();

            System.out.print("Masukkan nilai english: ");
            double english = input.nextDouble();

            System.out.print("Masukkan nilai science: ");
            double science = input.nextDouble(); input.nextLine();

            Siswa[i] = new Student(math, english, science);
            Siswa[i].setName(name);
            Siswa[i].setAddress(address);
            Siswa[i].setAge(age);
        }

        for ( ; j < jumlahSiswa; j++) {
            System.out.println("===================");
            System.out.println("Siswa ke-" + (j + 1));
            Siswa[j].displayMessage();
            System.out.println("===================");
        }

        Student.jumlahObjek();
        
    // Student anna = new Student();
    // anna.setName("Anna");
    // anna.setAddress("Malang");
    // anna.setAge(20);
    // anna.setMath(100);
    // anna.setScience(89);
    // anna.setEnglish(80);
    // anna.displayMessage();
    
    // //menggunakan constructor lain
    // System.out.println("===================");
    // Student chris = new Student("Chris", "Kediri", 21);
    // chris.setMath(30);
    // chris.setScience(40);
    // chris.setEnglish(50);
    // chris.displayMessage();

    // //menggunakan constructor lain
    // System.out.println("===================");
    // Student Fahry = new Student();
    // Fahry = new Student(100, 100, 100);
    // Fahry.setName("Fahry");
    // Fahry.setAddress("Jakarta");
    // Fahry.setAge(19);
    // Fahry.displayMessage();
    
    // //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
    // System.out.println("===================");
    // anna = new Student("anna", "Batu", 18);
    // anna.displayMessage();
    
    // //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
    // System.out.println("===================");
    // chris.setAddress("Surabaya");
    // chris.setAge(22);
    // chris.displayMessage();
    }
}
