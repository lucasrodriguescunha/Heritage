import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Department> departments = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar departamento");
            System.out.println("2. Cadastrar funcionário");
            System.out.println("3. Listar salários de um departamento");
            System.out.println("4. Listar salários de todos os departamentos");
            System.out.println("5. Sair");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (option) {
                case 1:
                    System.out.println("Digite a descrição do departamento:");
                    String description = scanner.nextLine();
                    System.out.println("Digite o valor da hora trabalhada:");
                    double valueHourWorked = scanner.nextDouble();
                    departments.add(new Department(description, valueHourWorked));
                    break;
                case 2:
                    // Cadastrar funcionário
                    // ...
                    break;
                case 3:
                    // Listar salários de um departamento
                    // ...
                    break;
                case 4:
                    // Listar salários de todos os departamentos
                    // ...
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}