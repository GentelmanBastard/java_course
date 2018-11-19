public class minutes_seconds {
    public static void main(String[] args){
        System.out.println(getDurationString(240, 79));
        System.out.println(getDurationString(134, 45));
    }
    private static String getDurationString(int minutes, int seconds){
        int minutesValue = 0;
        int secondsValue = 0;
        int hoursValue = 0;
        if ((minutes >= 0) && (seconds >= 0)){
            if (minutes >= 60){
                hoursValue = minutes / 60;
                minutesValue = minutes % 60;

                if (seconds >= 60){
                    minutesValue += seconds / 60;
                    secondsValue = seconds % 60;
                }
            }else {
                return "Invalid Value";
            }
        }
        return hoursValue + "h" + minutesValue + "m" + secondsValue + "s";
    }
}

