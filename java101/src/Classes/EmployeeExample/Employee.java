package Classes.EmployeeExample;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0.0;
        if (salary > 1000) {
            tax = salary * 3 / 100;
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0.0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
            return bonus;
        }
        return bonus;
    }

    public double raiseSalary() {
        double raise;
        if (2021 - hireYear > 19) {
            raise = salary * 15 / 100;
            return raise;
        }
        else if (2021 - hireYear < 10) {
            raise = salary * 5 / 100;
            return raise;
        }
        else {
            raise = salary * 10 / 100;
            return raise;
        }
    }

    public void toMyString() {
        double tax = tax();
        double bonus = bonus();
        double raiseSalary = raiseSalary();
        double salaryWithBonusesAndTaxes = salary + bonus - tax;
        double totalSalary = salaryWithBonusesAndTaxes + raiseSalary;
        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma Saati: " + workHours);
        System.out.println("Başlangıç Yılı: " + hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + raiseSalary);
        System.out.println("Vergi ve bonuslarla birlikte maaş: " + salaryWithBonusesAndTaxes);
        System.out.println("Toplam Maaş: " + totalSalary);
    }
}
