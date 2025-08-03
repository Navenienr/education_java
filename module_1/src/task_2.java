
//Показать на экране все числа Фибоначчи в диапазоне от 0 до 10 000 000.
public class task_2 {
    public static void main(String[] args) {

        int sum = 0;
        int first_number =  1;
        int second_number = 1;

        do {
            sum = first_number + second_number;
            System.out.println(sum);

            first_number = second_number;
            second_number = sum;
        }
        while (sum <= 10000000);
    }
}

