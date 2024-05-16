// Class Department
// Classe Departamento
public class Department {
    private String description; // Descrição
    private double valueHourWorked; // Valor da hora trabalhada

    // Constructor
    // Construtor
    public Department(String description, double valueHourWorked) {
        this.description = description;
        this.valueHourWorked = valueHourWorked;
    }

    // Getters e Setters
    // Obter e definir
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValueHourWorked() {
        return valueHourWorked;
    }

    public void setValueHourWorked(double valueHourWorked) {
        this.valueHourWorked = valueHourWorked;
    }
}
