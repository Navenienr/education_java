import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OOP_task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите данные сотрудников (для выхода введите 'n'):");

        while(true) {
            System.out.print("Хотите добавить сотрудника? (y/n): ");
            String userChoice = input.nextLine();
            if (userChoice.equals("n")) {
                break;
            }
            new EmployeeWorkingHours(input);
        }

        EmployeeWorkingHours.displayAllEmployeesInfo();
        input.close();
    }
}

class EmployeeWorkingHours {
    private static List<EmployeeWorkingHours> allemploye = new ArrayList<>();
    private String name;
    private double amountEarned;

    public EmployeeWorkingHours(Scanner input) {
        System.out.print("Введите имя сотрудника: ");
        this.name = input.nextLine();

        System.out.print("Введите сумму заработка: ");
        this.amountEarned = Double.parseDouble(input.nextLine());

        allemploye.add(this);
        System.out.println("Сотрудник добавлен!\n");
    }

    public static void displayAllEmployeesInfo() {
        System.out.println("\n___________________________________________________");
        System.out.println("|   Имя   |   Заработок   |   Налог   |   К оплате   |");
        System.out.println("___________________________________________________");

        for (EmployeeWorkingHours emp : allemploye) {
            double tax = emp.amountEarned * 0.15;
            double netSalary = emp.amountEarned - tax;

            System.out.printf("| %-7s | %13.2f | %9.2f | %12.2f |\n",
                    emp.name, emp.amountEarned, tax, netSalary);
        }
        System.out.println("___________________________________________________");
    }
}