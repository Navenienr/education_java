import java.util.Scanner;
//написать программу, в которой пользователь ввод с клавиатуры вводит сумму в рубялх, а на выходе
//необходимо добавить к этой сумме в зависимости от контекста рубль, рублей или рубля.
public class task_7 {
    public static void main(String[] args) {

        System.out.print("Введите вашу сумму: ");
        Scanner input = new Scanner(System.in);
        int moneyInRub = input.nextInt();

        int lastDigit = moneyInRub % 10;
        switch(lastDigit) {

            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.printf("у вас %d рублей" , moneyInRub);
                break;
            case 1:
                System.out.printf("у вас %d рубль" , moneyInRub);
                break;
            case 2:
            case 3:
            case 4:
                System.out.printf("у вас %d рубля" , moneyInRub);
        }
    }
}
//здесь в целом идея решения не сложная, надо только учесть, что в зависисмотсти от десятков также меняется окончание