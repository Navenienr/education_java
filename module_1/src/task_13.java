
//написать программу, которая получает сначала массив в обычном порядке, а потом в обратном.
//по крайней мере я передам этот массив в функцию, которая его выводит.

public class task_13 {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5};
        int lenthMyArray = myArray.length;
        int []reverseMyArray = new int[lenthMyArray];
        int j = 0;
        for (int i = myArray.length-1; i >= 0; i--){
            reverseMyArray[j] = myArray[i];
            j++;
        }
        printArrayFunction(myArray);
        printArrayFunction(reverseMyArray);
    }
    public static void printArrayFunction(int []array){
        for (int i = 0; i<array.length; i++){
            System.out.printf("%d ",  array[i]);
        }
        System.out.println();
    }
}
