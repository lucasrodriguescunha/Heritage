// Class Commissioned
// Classe Comissionado
class Commissioned extends Employee {
    private double salesValue; // Valor de vendas
    private double commissionPercentage; // Percentual de comissão

    public Commissioned(String name, String city, String state, Department department, double salesValue, double commissionPercentage) {
        super(name, city, state, department);
        this.salesValue = salesValue;
        this.commissionPercentage = commissionPercentage;

    }

    @Override
    public double calculateSalary() {
        return 0;
    }
}
