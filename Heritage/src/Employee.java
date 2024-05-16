// Class Employee
// Classe Funcionário
public abstract class Employee {
    private String name; // Nome
    private String city; // Cidade
    private String state; // Estado
    private Department department;
    // Essa linha declara uma variável chamada department,
    // que é um objeto da classe Departamento. Essa variável
    // será usada para armazenar a referência ao departamento
    // ao qual o funcionário está associado.

    // Constructor
    // Construtor
    public Employee(String name, String city, String state, Department department) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.department = department;
    }

    // Abstract method to calculate salary
    // Método abstrato para calcular salário

    // ?

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public abstract double calculateSalary() {
        //
    }
}
