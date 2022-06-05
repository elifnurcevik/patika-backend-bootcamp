package Task41;

public class Employee {
    String name;
    double salary;
    int workHours;
    int startingYear;

    public Employee(String name,double salary,int workHours, int startingYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.startingYear = startingYear;
    }

    public void print(){
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Starting Year:" + startingYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary Increase: " + increaseSalary());
        System.out.println("Salary with Taxes and Bonuses : " + (this.salary+ this.bonus() - this.tax()));
        System.out.println("Total Salary : " + (this.salary + this.increaseSalary()));

    }
    public double tax(){
        if(this.salary < 1000){
            return 0;
        }
        if(this.salary > 1000){
            return 0.03 * this.salary;
        }
        return 0;
    }

    public double bonus(){
        if(this.workHours > 40){
            return (this.workHours - 40) * 30;
        }
        else {
            return 0;
        }
    }
    public double increaseSalary(){
        double raiseRate;
        int year = 2021 - this.startingYear;

        if(year < 10){
            raiseRate = 0.05;
        } else if (year < 20) {
            raiseRate = 0.1;
        } else {
            raiseRate = 0.15;
        }

        return this.salary*raiseRate;

    }
}
