public class barks {
    public static void main(String[] args){
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));

    }
    private static boolean bark(boolean barking, int hourOfDay){
        if (hourOfDay > 24 || hourOfDay < 0){
            return false;
        }
        return (barking) && ((hourOfDay < 8) || (hourOfDay >= 23));
    }
}
