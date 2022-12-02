public class Main {

    public static void printSeparator() {
        System.out.println("=====================================================================================================");
    }
    public static void main(String[] args) {

        EmployeeService employerService = new EmployeeService();

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иван", "Иванович", "Иванов", 1, 36000);
        employee[1] = new Employee("Петр", "Петрович", "Петров", 1, 40000);
        employee[2] = new Employee("Антон", "Антонович", "Антонов", 2, 40000);
        employee[3] = new Employee("Борис", "Борисович", "Борисов", 2, 45000);
        employee[4] = new Employee("Владимир", "Владимирович", "Владимиров", 3, 55000);
        employee[5] = new Employee("Григорий", "Григорьевич", "Григорьев", 3, 60000);
        employee[6] = new Employee("Дмитрий", "Дмитриевич", "Дмитриев", 4, 50000);
        employee[7] = new Employee("Егор", "Егогьевич", "Егоров", 4, 55000);
        employee[8] = new Employee("Игорь", "Игоревич", "Игоренков", 5, 35000);
        employee[9] = new Employee("Константин", "Константинович", "Константинов", 5, 45000);

        printSeparator();
        for (Employee i : employee) {
            System.out.println(i);
            printSeparator();
        }
        System.out.println("Сумма затрат на зарплаты сотрудников за месяц: " + employerService.calculateTotalSum(employee) + " рублей");
        printSeparator();
        System.out.println(employerService.calculateMinSum(employee) + " рублей");
        printSeparator();
        System.out.println(employerService.calculateMaxSum(employee) + " рублей");
        printSeparator();
        System.out.println("Среднее значение зарплат: " + employerService.calculateTotalSum(employee)/employee.length + " рублей");
        printSeparator();
    }
}