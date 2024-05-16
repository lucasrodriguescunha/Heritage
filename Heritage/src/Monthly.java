// Class Monthly
// Classe Mensalista
class Monthly extends Employee {
    private double salary; // Salário

    public Monthly(String name, String city, String state, Department department, double salary) {
        super(name, city, state, department);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
