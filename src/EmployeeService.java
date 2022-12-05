public class EmployeeService {
    public Employee[] employee = new Employee[10];

    public double calculateTotalSum(Employee[] employee) { // находим общую сумму затрат на з/п
        double sum = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }
    public int notZeroSalaries(Employee[] employee) { // находим сотрудников с не нулевой зарплатой
        int notZeroSalaries = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() !=0) {
                notZeroSalaries = notZeroSalaries + 1;
            }
        }
        return notZeroSalaries;
    }
    public double calculateMinSum(Employee[] employee) { // Находим сотрудника с минимальной зарплатой
        double minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > 0) {
                if (minSalary > employee[i].getSalary()) {
                    minSalary = employee[i].getSalary();
                }
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() == minSalary) {
                    System.out.println("У сотрудника по фамилии: " + employee[i].lastName + " самая низкая зарплата ");
                }
            }
        }
        return minSalary;
    }

    public double calculateMaxSum(Employee[] employee) { // Находим сотрудника с максимальной зарплатой
        double maxSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (maxSalary < employee[i].getSalary()) {
                    maxSalary = employee[i].getSalary();
                }
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() == maxSalary) {
                    System.out.println("У сотрудника по фамилии: " + employee[i].lastName + " самая высокая зарплата ");
                }
            }
        }
            return maxSalary;
        }
    }

