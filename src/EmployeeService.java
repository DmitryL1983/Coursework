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

    public double calculateMinSum(Employee[] employee) {
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
                    System.out.println("У сотрудника по фамилии: " + employee[i].lastName + ". Самая низкая зарплата ");
                }
            }
        }
        return minSalary;
    }

    public double calculateMaxSum(Employee[] employee) {
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
                    System.out.println("У сотрудника по фамилии: " + employee[i].lastName + ". Самая высокая зарплата ");
                }
            }
        }
            return maxSalary;
        }
    }

