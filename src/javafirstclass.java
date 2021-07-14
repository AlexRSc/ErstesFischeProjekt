public class javafirstclass {
    public static void main(String[] args) {
        String text ="asdasidjoaisdjioehrbniosadnasdniasjdionawefancydancy";
        boolean printboolean = hasdas(text);
        System.out.println("Does it contain 'das'? " + printboolean);
        int length= lengthString(text);
        System.out.println("How long is this String? " + length);
        if (length>20){
            System.out.println("Its longer than 20 characters!");
        }
        else {
            System.out.println("Its shorter than 20 characters...");
        }
        boolean isFancy = hasfancy(text);
        if(isFancy) {
            System.out.println("This text is very fancy!");
        }
        else{
            System.out.println("This text is not fancy at all!");
        }

    }

    public static boolean hasdas(String checking) {
        boolean logic=checking.contains("das");
        return logic;
    }

    public static int lengthString(String longboy) {
        int length=longboy.length();
        return length;
    }
    public static boolean hasfancy(String checkString) {
        boolean logic=checkString.contains("fancy");
        return logic;
    }
}
