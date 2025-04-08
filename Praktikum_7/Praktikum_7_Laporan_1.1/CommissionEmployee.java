import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double grossSales;// penjualan per minggu
    private double commissionRate;// komisi

    public CommissionEmployee(String name, String noKTP, LocalDate tanggalLahir, double sales, double rate) {
        super(name, noKTP, tanggalLahir);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        grossSales = sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public double getCommissionRate() {

        return commissionRate;
    }
    
    public double earnings() {
        double totalSalary = getCommissionRate() * getGrossSales();
        if (ulangTahun()) {
            totalSalary += 100000; 
        }
        return totalSalary;
    }

    public String toString() {
        return String.format("Commision employee: " + super.toString() + "\ngross sales: " + getGrossSales()
                + "\ncommission rate " + getCommissionRate());
    }
}
