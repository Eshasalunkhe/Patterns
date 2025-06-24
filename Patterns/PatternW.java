public class PatternW {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 13;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (
                    j == 1 ||               
                    j == cols ||              
                    (i >= 4 && j == i + 2) ||       
                    (i >= 4 && j == cols - i - 2)   
                ) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

