import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate tanggalLahir;

    public Employee(String name, String noKTP, LocalDate tanggalLahir) {
        this.name = name;
        this.noKTP = noKTP;
        this.tanggalLahir = tanggalLahir;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public boolean ulangTahun() {
        LocalDate ultah = LocalDate.now();
        return ultah.getMonth() == tanggalLahir.getMonth();
    }
    
    public String toString() {
        return String.format(" " + getName() + "\nNo. KTP :" + getNoKTP());
    }

    public abstract double earnings();// pendapatan
}