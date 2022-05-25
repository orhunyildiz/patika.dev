package Arrays;

public class TheBLetter {
    public static void main(String[] args) {
        String[][] letter = new String[7][10];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (j == 0 || j == letter[i].length - 1)
                    letter[i][j] = "*";
                else
                    letter[i][j] = " ";
                if (i == 0 || i == 3 || i == 6) {
                    if (j == 3 || j == 6)
                        letter[i][j] = "*";
                }
            }
        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
