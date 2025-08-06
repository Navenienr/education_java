

//написать программу, которая заносит в массив первые 100 чисел, которые делятся на 13 и 17, а также вывести его

public class task_14 {
    public static void main(String[] args) {
        long [] myArray = new long[100];
        int i = 0;
        int j = 0;

        while (j < 100){
            i++;
            if (i % 13 == 0 && i % 17 == 0){
                myArray[j] = i;
                System.out.println(myArray[j]);
                j++;
            }
        }
    }
}

