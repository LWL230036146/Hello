public class test {
    
    public static void main(String[] args) {
       
        //int [][] matrix = new int[3][4];
        //int [][] matrix = {{1, 2}, {3, 4}, {5, 6, 7}, {7}};
        //System.out.println(matrix[0][0] + " " + matrix[0][1]);
        //System.out.println(matrix[3].length);
        //System.out.println(matrix[3][matrix[0][1]]);
       // int [][] m = {{1, 2, 3}, {4, 5, 6}, {7}, {8, 9}};

        //System.out.println(m[m[1].length][1]);

        //int [] a = {1, 2, 3, 4, 5};
        //System.out.println( a[1] + a[4] );

        /*int [ ] list = new int [10];
	        for ( int i = 0; i <= list.length; i++)
		        System.out.println ( list [i] ); */

    int [][] mTable = new int [10][10];

        for (int i = 0; i < mTable.length; i++){
            for (int j = 0; j < mTable[i].length; j++){
                mTable [i][j] = i * j;
            }
        }
        System.out.print("   ");
            for (int j = 0; j < mTable[0].length; j++){
                System.out.printf("%3d", j);
            }
        System.out.println();
        System.out.print(" +-");
            for (int j = 0; j < mTable[0].length; j++){
                System.out.printf("---");
            }
        System.out.println();    

        for (int i = 0; i < mTable.length; i++){
            System.out.print(i + "|"+" ");
            for (int j = 0; j < mTable.length; j++){
            System.out.printf( "%3d", mTable[i][j]);
            }
            System.out.println();
        }
    }
}
