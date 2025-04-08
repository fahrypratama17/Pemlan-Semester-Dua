import java.time.LocalDate;

public class ProductionEmployee extends Employee {
    private int banyakBarang; 
    private double upahPerBarang; 

    public ProductionEmployee(String name, String noKTP, LocalDate tanggalLahir, int banyakBarang, double upahPerBarang) {
        super(name, noKTP, tanggalLahir);
        this.banyakBarang = banyakBarang;
        this.upahPerBarang = upahPerBarang;
    }

    public void setBanyakBarang(int banyakBarang) {
        this.banyakBarang = banyakBarang;
    }

    public int getBanyakBarang() {
        return banyakBarang;
    }

    public void setUpahPerBarang(double upahPerBarang) {
        this.upahPerBarang = upahPerBarang;
    }

    public double getUpahPerBarang() {
        return upahPerBarang;
    }

    public double earnings() {
        double totalSalary = getBanyakBarang() * getUpahPerBarang();
        if (ulangTahun()) {
            totalSalary += 100000; 
        }
        return totalSalary;
    }

    public String toString() {
        return String.format(
                "Production employee: " + super.toString() + "\njumlah barang: " + banyakBarang + "\nUpah per barang: " + upahPerBarang);
    }
}
