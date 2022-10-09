public class Main {
    private  static  final Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee("Иван Иванович Иванов", 1, 40510);
        employee[1] = new Employee("Иван Сергеевич Серов", 2, 52104);
        employee[2] = new Employee("Борис Алексеевич Каров", 1, 38500);
        employee[3] = new Employee("Павел Андреевич Куприн", 3, 42510);
        employee[4] = new Employee("Марк Эдуардович Кудров", 3, 65510);
        employee[5] = null;
        employee[6] = null;
        employee[7] = null;
        employee[8] = null;
        employee[9] = null;
        System.out.println("Список всех сотрудников:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i]);
            }
        }
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц " + calculateSumSalary() + " рублей.");
        System.out.println();

        Employee employeeWithMaxSalary = getMaxSalary();
        if (employeeWithMaxSalary == null) {
            System.out.println("Нет сотрудника с максимальной зарплатой");
        } else {
            System.out.println("Сотрудник с максимальной зараплатой: " + employeeWithMaxSalary);
        }
        System.out.println();

        Employee employeeWithMinSalary = getMinSalary();
        if (employeeWithMinSalary == null) {
            System.out.println("Нет сотрудника с минимальной зарплатой");
        } else {
            System.out.println("Сотрудник с минимальной зараплатой: " + employeeWithMinSalary);
        }

        System.out.println();

        System.out.println("Среднее значение зарплат: " + getAverageSalary() + " рублей.");
        System.out.println();

        System.out.println("Ф.И.О. сотрудников");
        System.out.println();

        for (int j = 0; j < employee.length; j++) {
            if (employee[j] != null) {
                System.out.println(employee[j].listEployee());
            }
        }
    }
    public static int calculateSumSalary () {
        int sumSalary = 0;
        for (int m = 0; m < employee.length; m++) {
            if (employee[m] != null) {
                sumSalary = sumSalary + employee[m].getSalary();
            }
        }
        return sumSalary;
    }
    public static double getAverageSalary () {
        double averageSalary = 0;
        int sum = calculateSumSalary();
        for (int t = 0; t < employee.length; t++) {
            if (employee[t] != null) {
                averageSalary = (double) sum / (t+1);
            }
        }
        return averageSalary;
    }
    public static Employee getMaxSalary () {
        int maxSalary = 0;
        Employee targetEmployee = null;
        for (int d = 0; d < employee.length; d++) {
            if (employee[d] != null && employee[d].getSalary() > maxSalary) {
                maxSalary = employee[d].getSalary();
                targetEmployee = employee[d];
            }
        }
        return targetEmployee;
    }
    public static Employee getMinSalary () {
        int minSalary = 200000;
        Employee targetEmployee2 = null;
        for (int s = 0; s < employee.length; s++) {
            if (employee[s] != null && employee[s].getSalary() < minSalary) {
                minSalary = employee[s].getSalary();
                targetEmployee2 = employee[s];
            }
        }
        return targetEmployee2;
    }
}
