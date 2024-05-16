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
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar departamento");
            System.out.println("2. Cadastrar funcionário");
            System.out.println("3. Listar salários de um departamento");
            System.out.println("4. Listar salários de todos os departamentos");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (option) {
                case 1:
                    System.out.println("\nCadastro de departamento:");
                    System.out.println("Digite a descrição do departamento:");
                    String description = scanner.nextLine();
                    System.out.println("Digite o valor da hora trabalhada:");
                    double hourlyValueWorked  = scanner.nextDouble();
                    departments.add(new Department(description, hourlyValueWorked));
                    break;
                case 2:
                    System.out.println("\nCadastro de funcionário:");
                    System.out.println("Digite o nome do funcionário:");
                    String name = scanner.nextLine();
                    System.out.println("Digite a cidade:");
                    String city = scanner.nextLine();
                    System.out.println("Digite o estado:");
                    String state = scanner.nextLine();
                    System.out.println("Selecione o tipo de funcionário:");
                    System.out.println("1. Mensalista");
                    System.out.println("2. Horista");
                    System.out.println("3. Comissionado");
                    int typeEmployee = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.println("Selecione o departamento:");
                    for (int i = 0; i < departments.size(); i++) {
                        System.out.println((i + 1) + ". " + departments.get(i).getDescription());
                    }
                    int departamentoSelecionado = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    Department departamento = departments.get(departamentoSelecionado - 1);
                    switch (typeEmployee) {
                        case 1:
                            System.out.println("Digite o salário:");
                            double salary = scanner.nextDouble();
                            employees.add(new Hourly(name, city, state, departamento));
                            break;
                        case 2:
                            System.out.println("Digite a quantidade de horas trabalhadas:");
                            double horasTrabalhadas = scanner.nextDouble();
                            employees.add(new Hourly(name, city, state, departamento));
                            break;
                        case 3:
                            System.out.println("Digite o valor das vendas:");
                            double valorVendas = scanner.nextDouble();
                            System.out.println("Digite o percentual de comissão:");
                            double percentualComissao = scanner.nextDouble();
                            employees.add(new Commissioned(name, city, state, departamento, valorVendas, percentualComissao));
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    System.out.println("\nListar salários de um departamento:");
                    System.out.println("Selecione o departamento:");
                    for (int i = 0; i < departments.size(); i++) {
                        System.out.println((i + 1) + ". " + departments.get(i).getDescription());
                    }
                    int departamentoEscolhido = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    Department dept = departments.get(departamentoEscolhido - 1);
                    double totalSalarios = 0;
                    for (Employee funcionario : employees) {
                        if (funcionario.getDepartment().equals(dept)) {
                            double salario = funcionario.calculateSalary();
                            totalSalarios += salario;
                            System.out.println(funcionario.getName() + ": " + salario);
                        }
                    }
                    System.out.println("Total de salários do departamento " + dept.getDescription() + ": " + totalSalarios);
                    break;
                case 4:
                    System.out.println("\nListar salários de todos os departamentos:");
                    for (Department dep : departments) {
                        double totalSalariosDept = 0;
                        System.out.println("\nDepartamento: " + dep.getDescription());
                        for (Employee funcionario : employees) {
                            if (funcionario.getDepartment().equals(dep)) {
                                double salario = funcionario.calculateSalary();
                                totalSalariosDept += salario;
                                System.out.println(funcionario.getName() + ": " + salario);
                            }
                        }
                        System.out.println("Total de salários: " + totalSalariosDept);
                    }
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