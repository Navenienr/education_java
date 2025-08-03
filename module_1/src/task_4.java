//напишите программу, которая выводит таблицу умножения

public class task_4 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i < 10){
            while(j < 10){
                int number_multiplication = i*j;
                System.out.print(number_multiplication + "\t");
                j ++;
            }
            System.out.println("\n");
            j = 1;
            i++;
        }
    }
}
