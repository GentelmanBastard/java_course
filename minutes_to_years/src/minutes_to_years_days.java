public class minutes_to_years_days {
    public static void main(String[] args){
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }
    private static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        int hour = 60;
        int day = 24 * hour;
        int year = 365 * day;
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long remainderDays = days % 365;
        System.out.println(minutes + " minutes = " + years + " y " + remainderDays + " d" );


    }
}
