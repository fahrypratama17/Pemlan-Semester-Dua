import java.util.Scanner;
public class MainAritmatika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai 1 : ");
        int nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil2 = in.nextInt();
        //memanggil method static
        Aritmatika.hitungPengurangan(nil1, nil2);
        System.out.print("masukkan nilai 1 : ");
        nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nil2 = in.nextInt();
        //memanggil method static
        Aritmatika.hitungPerkalian(nil1, nil2);
        System.out.print("masukkan nilai 1 : ");
        int value1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int value2 = in.nextInt(); in.nextLine();
        //memanggil method NONstatic harus melalui objek
        Aritmatika a = new Aritmatika();
        a.hitungPenjumlahan(value1, value2);
        System.out.print("masukkan nilai 1 : ");
        String val1 = in.nextLine();
        System.out.print("masukkan nilai 2 : ");
        String val2 = in.nextLine();
        //memanggil method NONstatic harus melalui objek
        Aritmatika b = new Aritmatika();
        double hasil = b.hitungPembagian(val1, val2);
        System.out.println("nilai pembagian adalah : " + hasil);
    }
}