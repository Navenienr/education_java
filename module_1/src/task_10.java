import java.util.Scanner;

//написать программу, которая высчитывает кол-во цифр в числе

public class task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int numberInput = input.nextInt();
        input.close();

        int lenghtNumberInput = 0;
        while (numberInput != 0){
            numberInput /=10;
            lenghtNumberInput++;
        }
        System.out.printf("%d",lenghtNumberInput);
    }
}

//здесь как по мне есть несколько вариантов решения, и самый наверное быстрый - перевести число в строковое представление
// и посчитать кол-во элементов, хотя с другой стороны можно сделать и как я. работа заключается в том, что деление просиходит до тех пор
// пока вводимое число не станет равно 0, а оно станет таковым после того, как мы разделим последнюю цифру на 10, а за счет округления и перевода в Int, оно станет 0
// но есть момент, что если вводится 0, то подсчет не происходит и можно просто добавить if.

