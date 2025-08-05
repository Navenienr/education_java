import java.util.Scanner;
//написать программу, которая высчитывает денежный вклад по сложному проценту

public class task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("your money: ");
        double moneyInput = input.nextDouble();
        System.out.printf("your procent: ");
        double procentInput = input.nextInt();
        System.out.printf("your time: ");
        int timeInput = input.nextInt();

        procentInput = procentInput / 100;

        for(int i = 1; i <= timeInput; i++){
            moneyInput = (moneyInput * procentInput) + moneyInput;
        }
        System.out.println("your money is: " + moneyInput);
        input.close();
    }
}
