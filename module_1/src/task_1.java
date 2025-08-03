//дан номер месяца, вывести сезон года, к которому относится данный месяц

public class task_1 {
    public static void main(String[] args) {
        int mounth = 1;

        switch(mounth) {
            case 1, 2, 12:
                System.out.println("зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;

        }
    }
}
