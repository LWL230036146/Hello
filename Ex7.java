public class Ex7 {

    public static void main(String[] args) {

        char[][] mTable = new char[10][10];
        for (int i = 0; i < mTable.length; i++) {
            for (int j = 0; j < mTable[i].length; j++) {
                mTable[i][j] = '.';
            }
        }

        int row = 2;
        int col = 2;
        for (int i = 0; i < 5; i++) {
            mTable[row][col + i] = 'S';
        }

        for (int i = 0; i < 5; i++) {
            mTable[row + i][col] = 'S';
        }

        printTable(mTable);

        int counter = 0;
        for (int i = 0; i < mTable.length; i++) {
            for (int j = 0; j < mTable[i].length; j++) {
                if (mTable[i][j] == 'S')
                    counter++;
            }
        }

        System.out.println("Total number of S: " + counter);
        // print column numbers

    }

    public static void printTable(char[][] mTable) {
        System.out.printf("    ");
        for (int j = 0; j < mTable[0].length; j++) {
            System.out.printf("%3d", j);
        }
        System.out.println();

        System.out.printf("   +");
        for (int j = 0; j < mTable[0].length; j++) {
            System.out.printf("---");
        }
        System.out.println();

        // print data
        for (int i = 0; i < mTable.length; i++) {
            System.out.printf("%3d|", i); // print the row number
            for (int j = 0; j < mTable[i].length; j++) {
                System.out.printf("%3c", mTable[i][j]);
            }
            System.out.println();
        }

    }
}
