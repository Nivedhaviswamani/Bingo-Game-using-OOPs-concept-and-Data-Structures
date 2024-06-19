package project;

public class Check {
    public static int checkBingo(int[][] a) {
        int win = 0;
        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        for (int i=0;i<5;i++) {
            int sumRow = 0;
            int sumCol = 0;

            for (int j=0;j<5;j++) {
                sumRow+=a[i][j];
                sumCol+=a[j][i];
                if (i==j)
                    sumPrimaryDiagonal += a[i][j];
                if (i+j==4)
                    sumSecondaryDiagonal+=a[i][j];
            }
            if (sumRow==0)
                win++;
            if (sumCol==0)
                win++;
        }
        if (sumPrimaryDiagonal==0) 
            win++;
        if (sumSecondaryDiagonal==0) 
            win++;

        return win;
        
}
  
}