public class hasEqual {
    public static void main(String[] args){
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(-1,5,4));
    }
    private static boolean hasEqualSum(int x, int y, int z){
        return (x + y == z);
    }
}
