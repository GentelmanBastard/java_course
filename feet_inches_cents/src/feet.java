public class feet {
    public static void main(String[] args){
        System.out.println(calcFeetAndInchesToCentimeters(3, 4));
        System.out.println(calcFeetAndInchesToCentimeters(2, 15));

    }
    private static double calcFeetAndInchesToCentimeters(double feet, double inches){
        int feetValue = 12;
        if ((feet >= 0) && (inches >= 0 && inches <= 12)){
            double inchValue = (feet * 12) + inches;
            double cents = calcFeetAndInchesToCentimeters(inchValue);
            System.out.println(feet + " feet and " + inches + " inches equal " + cents + " centimeters" );
            return cents;
        }
        return -1;
    }
    private static double calcFeetAndInchesToCentimeters(double inches){
        double inchValue = 2.54;
        if (inches >= 0){
            return inches * inchValue;
        }
        return -1;
    }
}
