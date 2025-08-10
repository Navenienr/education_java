import java.util.Scanner;

//написать метод equals, который определяет равны ли между собой соответствующие элементы двумерных массивов.


public class task_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfTheNumberInTheColumn;
        int numberOfTheNumberInTheRow;
        int [][] firstMyArray= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] secondMyArray= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        System.out.print("Enter the number of elements in the array: ");
        numberOfTheNumberInTheColumn = input.nextInt();
        System.out.print("Enter the elements in the array: ");
        numberOfTheNumberInTheRow = input.nextInt();
        input.close();

        System.out.println(x(firstMyArray,secondMyArray,numberOfTheNumberInTheColumn, numberOfTheNumberInTheRow));

    }

    public static boolean x (int [][]firstArray, int [][]secondArray, int numberOfTheNumberInTheColumn, int numberOfTheNumberInTheRow){
        if (firstArray[numberOfTheNumberInTheColumn] [numberOfTheNumberInTheRow] == secondArray [numberOfTheNumberInTheColumn] [numberOfTheNumberInTheRow]){
            return true;
        }
        else  {
            return false;
        }
    }
}
