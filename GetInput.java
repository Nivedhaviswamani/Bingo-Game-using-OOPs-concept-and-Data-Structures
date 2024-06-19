package project;
import java.util.*;
public class GetInput {
public int[][] getInput()
{
	int arr[][]=new int[5][5];
	int i,j;
	Scanner sc=new Scanner(System.in);
	 for(i=0;i<5;i++)
	    {
	        for(j=0;j<5;j++)
	        {
	            arr[i][j]=sc.nextInt();
	           
	        }
	        System.out.println();
	    }
return arr;
}
public Map<Integer,ArrayList<Integer>> getStoredInput(int arr[][])
{
	Map<Integer,ArrayList<Integer>> mp=new HashMap<>();
	 for(int i=0;i<5;i++)
	    {
	        for(int j=0;j<5;j++)
	        {
	            ArrayList<Integer> a=new ArrayList<>();
	            a.add(i);
	            a.add(j);
	            mp.put(arr[i][j],a);
	            
	           
	        }
	        System.out.println();
	    }
return mp;
}
}
