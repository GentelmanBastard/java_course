public class megas {
        public static void main(String[] args){
            printMegaBytesAndKiloBytes(2050);
        }

        private static void printMegaBytesAndKiloBytes(int kiloBytes) {
            if (kiloBytes < 0){
                System.out.println("Invalid Value");
            }else {
                int megaBytes = kiloBytes / 1024;
                int left = kiloBytes % 1024;
                System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + left + " KB");
            }
        }


}
