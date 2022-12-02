public class EmployeeService {
    public Employee[] employee = new Employee[10];

    public double calculateTotalSum(Employee[] employee) {
        double sum = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    public double calculateMinSum(Employee[] employee) { // Находим сотрудника с минимальной зарплатой
        double minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
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

