import java.util.Scanner;
//написать прграммму, в которой будет создана функция, которая принмиает 2 числа и возвразает наибольшее их них

public class task_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("введите ваши числа");
        System.out.printf("1: ");
        int a = input.nextInt();
        System.out.printf("2: ");
        int b = input.nextInt();

        System.out.printf("%d",comparisonOfNumbers(1,2));
    }
    public static int comparisonOfNumbers (int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber;
        }
        else if (firstNumber < secondNumber){
            return secondNumber;
        }
        else{
            return 0;
        }
    }
}

//в данной задачи я просто проверял работу функций,в целом нет ничего сложного, надо лишь разобраться в чем заключается работа каждого модификатора