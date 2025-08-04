import java.util.Scanner;

//дано целое число, определить является ли послденяя цифра - 3?
// решил попробовать впервые воспользоваться вводом с клавиатуры

public class task_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        if (n%10==3) {
            System.out.println("The number is a power of 3");
        }
        else{
            System.out.println("The number is not a power of 3");
        }
    }
}
