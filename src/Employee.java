public class Employee { // *
    private int id;
    private static int counter = 1;
    private final String fullName;
    private int department;
    private int salary;
    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++; }

    public String getFullName() {
        return this.fullName;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }
    public String toString() {
        return fullName +
                ", отдел №" + department +
                ". Заработная плата: " + salary + " рублей" + " id=" + id;
    }
    public String listEployee() {
        return fullName;
    }
}

