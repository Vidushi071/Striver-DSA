public class MatrixZero {


    public static void main(String[] args) {

        int matrix[][] = {{1,0,1},{1,1,1},{1,1,0}};
        int row[] = new int[3];
        int col[] = new int[3];


        // Better approach -
        // TC - O(m*n) SC- O(m+n)
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                if (matrix[i][j] == 0) {
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++) {
                if(row[i]==-1 || col[j]==-1){
                    matrix[i][j]=0;
                }
            }
        }



        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
