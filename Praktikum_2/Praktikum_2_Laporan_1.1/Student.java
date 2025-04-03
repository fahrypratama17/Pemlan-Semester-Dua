public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int count = 0;

    public Student(){
        name = "";
        address = "";
        age = 0;
        count++;
    }
    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        count++;
    }
    public Student(double m, double  e, double  s){
        mathGrade = m;
        englishGrade = e;
        scienceGrade = s;
        count++;
    }
    public void setName(String n){    
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setMath(double math){
        mathGrade = math;
    }
    public void setEnglish(double english){
        englishGrade = english;
    }
    public void setScience(double science){
        scienceGrade = science;
    }
    private double getAverage(){
        average = (mathGrade+scienceGrade+englishGrade)/3;
        return average;
    }

    private boolean statusAkhir(){
        if (average >= 61){
            return true;
        } else {
            return false;
        }
    } 

    public static void jumlahObjek(){
        System.out.println("Jumlah objek Student yang telah dibuat: " + count);
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama " +name);
        System.out.println("beralamat di " +address);
        System.out.println("berumur " +age);
        System.out.println("mempunyai nilai rata rata " +getAverage());
        System.out.println("Siswa dengan nama "+name+ " lolos? "+statusAkhir());
    }
}