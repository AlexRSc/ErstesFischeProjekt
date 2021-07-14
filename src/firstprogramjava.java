public class firstprogramjava {

    public static void main(String[] args) {

        int summydi1 = 50;
        int sum2 = 40;
        int summe = Addition(summydi1, sum2);
        printing(summe);
        boolean check = checking(summe);
        System.out.println("Is the sum larger than 100? Lets see: " + check);
    }

    public static int Addition (int value1 , int value2) {
        return value1 + value2;
    }

    public static void printing (int sum) {
        System.out.println("Summe : "+sum);
    }

    public static boolean checking (int sum) {
        if (sum>100) {
            return true;
        }
        else {
            return false;
        }

    }

}
