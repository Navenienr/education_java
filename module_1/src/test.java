public class test {
    public static void main(String[] args) {
        try {
            int [] values = new int [2];
            values[3] = 1;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        int x = 16;
    }
}

/*
*в целом исключния в джавемаксимально похожи на исключения в пайтон, вероятнее всего и сами исключения одни и те же,
* за исключением тех, где есть сами различия в подходе к языку программирования, по типу массивов и списков.
* */
