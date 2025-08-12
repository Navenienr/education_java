import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;


public class OOP_task_1 {
    public static void main(String[] args) {
        Human goga = new Human();
        goga.name = "Goga";
        goga.age = 30;
        goga.printInfoOnHuman();

        Human goga2 = new Human();
        goga2.name = "Goga2";
        goga2.age = 30;
        goga2.printInfoOnHuman();

        goga.printInfoOnHuman();
        goga2.printInfoOnHuman();
    }
}

class Human{
    String name;
    int age;
    void printInfoOnHuman(){
        System.out.printf("name: %s \t age: %d\n",name,age);
    }
}