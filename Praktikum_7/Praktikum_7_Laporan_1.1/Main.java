import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", LocalDate.of(2000, 1, 5), 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", LocalDate.of(2000, 2, 10), 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", LocalDate.of(2000, 3, 15), 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", LocalDate.of(2000, 4, 20),  5000, .04,300);
        
        ProductionEmployee productionEmployee1 = new ProductionEmployee("Rina", "567", LocalDate.of(2000, 5, 25), 500, 20);
        ProductionEmployee productionEmployee2 = new ProductionEmployee("Eko", "147", LocalDate.of(2000, 6, 25), 1000, 20);
        ProductionEmployee productionEmployee3 = new ProductionEmployee("Puja", "346", LocalDate.of(2000, 7, 25), 100, 20);
        ProductionEmployee productionEmployee4 = new ProductionEmployee("Bakwan", "264", LocalDate.of(2000, 4, 25), 300, 20);

        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", productionEmployee1, "Pendapatan", productionEmployee1.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", productionEmployee2, "Pendapatan", productionEmployee2.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", productionEmployee3, "Pendapatan", productionEmployee3.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", productionEmployee4, "Pendapatan", productionEmployee4.earnings());

        Employee[] employees = new Employee[8];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = productionEmployee1;
        employees[5] = productionEmployee2;
        employees[6] = productionEmployee3;
        employees[7] = productionEmployee4;

        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) { 
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
            }
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
    }
}
