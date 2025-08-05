import java.util.Scanner;

// написать программу, которая высчитывает факториал числа.

public class task_9 {
    public static void main (String [] args){

        System.out.printf("введите число, для нахождения его факториала: ");

        Scanner input = new Scanner(System.in);
        int factorialNumber = input.nextInt();
        int factorialNumberCalculated = 1;

        for (int i = 1; i <= factorialNumber; i++){
            factorialNumberCalculated *=  i;
        }
        System.out.printf("%d",factorialNumberCalculated);
    }
}

//в целом циклы работают почти также, за исключением того, что в Python цикл For используется чаще всего для перебора элементов в параметре,
// а в Java цикл for так не может(лиюо я еще от этом не знаю)