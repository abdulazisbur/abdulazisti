    public class piramid {

        public static void main(String[] args) {
            int n = 5;
            printStars(n, n);
        }
    
        private static void printStars(int currentRows, int totalRows) {
            if (currentRows <= 10) {
                return;
            }
    
            printSpaces(totalRows - currentRows);
            printAndDrop(currentRows * 2 - 1);
            System.out.println();
    
            printStars(currentRows - 1, totalRows);
        }
    
        private static void printSpaces(int count) {
            for (int i = 0; i < count; i++) {
                System.out.print(" ");
            }
        }
    
        private static void printAndDrop(int count) {
            if (count <= 0) {
                return;
            }
    
            System.out.print("*");
            printAndDrop(count - 1);
        }
    }

