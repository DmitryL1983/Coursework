public class Employee {
    public String firstName;
    public String middleName;
    public String lastName;
    private int depart;
    private double salary;
    private static int counter = 0;
    private final int id;

    public Employee (String firstName,String middleName, String lastName,int depart,double salary) {
        id = ++ counter;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.depart = depart;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }

    public int getDepart() {
        return this.depart;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }


    @Override
    public String toString() {
        return "таб. номер " + getId() + '\t' + "ФИО: " + getEmployeeName() + '\t' + "Отдел: " +getDepart() + '\t' +"Начислено з/п: " +getSalary() + " рублей";
    }
}