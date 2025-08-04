import java.util.Scanner;
//написать программу, в которой пользователь ввод с клавиатуры вводит сумму в рубялх, а на выходе
//необходимо добавить к этой сумме в зависимости от контекста рубль, рублей или рубля.
public class task_7 {
    public static void main(String[] args) {

        System.out.print("Введите вашу сумму: ");
        Scanner input = new Scanner(System.in);
        int moneyInRub = input.nextInt();
        int lastDigit = moneyInRub % 10;
        int tensNumber = moneyInRub % 100;

        if ((lastDigit == 0) || (5 <= lastDigit && lastDigit <= 9) || (10 <= tensNumber &&  tensNumber <= 20)) {
            System.out.printf("у вас %d рублей", moneyInRub );
        }
        else if (lastDigit == 1) {
            System.out.printf("у вас %d рубль", moneyInRub );
        }
        else if ( 2 <= lastDigit && lastDigit <= 4 ) {
            System.out.printf("у вас %d рубля", moneyInRub );
        }
    }
}
//здесь в целом идея решения не сложная, надо только учесть, что в зависисмотсти от десятков также меняется окончание
//тоесть надо учесть, что числа приставка для чисел от 10 включительно и до 20 также будет иметь также только рублей.
//в разы резоннее напсиать в таком случае уже через диапазаоны, нежели импользовать конструкцию switch case.