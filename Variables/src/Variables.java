public class Variables {
    public static void main(String[] args){
        String stringValue = "Mat";
        int intValue = 5;
        byte byteValue = 10;
        short shortValue = 20;
        long longValue = 50;
        double doubleValue = 5d;
        boolean booleanValue = true;
        char charValue = 'c';
        float floatValue = 5f;

        System.out.println("Int value:" + intValue / 3);
        System.out.println("Double value: " + doubleValue / 3);
        System.out.println("Float value: " + floatValue / 3);


        int kilo = 200;
        double pounds = 0.45359237;
        double result = kilo * pounds;
        System.out.println(result);
    }
}
