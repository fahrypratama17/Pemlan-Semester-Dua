public class Main {
    public static void main(String[] args) {
        Manusia a = new Manusia("A", "111", true, true);
        System.out.println(a);

        MahasiswaFilkom b = new MahasiswaFilkom("165150300111100", 4.0, "B", "111", false, false);
        System.out.println(b);

        Pekerja c = new Pekerja(1000, 2, 3, 2016, "C", "111", true, true, 4);
        System.out.println(c);

        Manager d = new Manager("HRD", 1000, 2, 1, 2017, "D", "111", true, true, 3);
        System.out.println(d);
    }
}