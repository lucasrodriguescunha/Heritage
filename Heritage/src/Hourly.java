// Class Hourly
// Classe Horista
class Hourly extends Employee {
    private double workedHours; // Horas trabalhadas

    public Hourly(String name, String city, String state, Department department) {
        super(name, city, state, department);
        this.workedHours = workedHours;
    }

    @Override
    public double calculateSalary() {
        return getDepartment().getValueHourWorked() * workedHours;
    }
}
