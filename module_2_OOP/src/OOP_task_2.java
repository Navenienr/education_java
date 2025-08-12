import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
/*
* напишите программу, которая будет отображать всю инфорамацию про все сорудников согласно их зарплате относительно
* часов работы и того, как они трудоустроены.
* */
public class OOP_task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            String usersChose = input.nextLine();
            if (usersChose == "n"){
                break;
            }

            System.out.printf("name: ");
            String name = input.nextLine();


        }


        input.close();
        EmployeeWorkingHours.displayingAllInformationAboutTheEmployee();
    }
}

class EmployeeWorkingHours {
    private static List <EmployeeWorkingHours>allemploye =  new ArrayList<>();
    String name;
    int hours;
    String[] typeOfEmployment = {"salary", "piecework", "hourly"};


    // Конструктор
    public EmployeeWorkingHours(String name,) {
        this.name = name;
        allemploye.add(this);
    }

    public static void displayingAllInformationAboutTheEmployee(){
        System.out.printf("___________________________________________________"+ "\n");
        System.out.printf("|   имя   |   налог   |   сумма    |   к оплате   |"+ "\n");
        System.out.printf("___________________________________________________"+ "\n");

        int size = allemploye.size();
            for (int i = 0; i < size; i++) {
                EmployeeWorkingHours emp = allemploye.get(i);
                System.out.printf("|   %s   |      |       |      |"+ "\n",emp.name );
            }

    }
}