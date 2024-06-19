package project;

public class PrintTable {
public static void print(int arr[][],int n)
{
	 System.out.println("player "+n+" table:");
	 int i,j;
     for(i=0;i<5;i++)
   {
       for(j=0;j<5;j++)
       {
           System.out.print(arr[i][j]+" ");
       }  
       System.out.println();
   }
}
}
