package project;
import java.util.*;
public class BIngoGameUsingOOPsAndDS {
	public static void main(String[] args) {
	    int a1[][]=new int[5][5];
	    int a2[][]=new int[5][5];
	    int i,j,count=0,win1=0,win2=0,sum1=0,sum2=0,temp;
	    Map<Integer,ArrayList<Integer>> mp1=new HashMap<>();
	    Map<Integer,ArrayList<Integer>> mp2=new HashMap<>();
	    Scanner sc=new Scanner(System.in);
	    GetInput g=new GetInput();
	    System.out.println("Enter input of player 1");
	    a1=g.getInput();
	   	System.out.println("Enter input of player 2");
	   a2=g.getInput();
	   mp1=g.getStoredInput(a1);
	   mp2=g.getStoredInput(a2);
	    while(win1<5 || win2<5)
	    {
	    System.out.println("player 1 say a number:");
	    temp=sc.nextInt();
	    System.out.println();
	    System.out.println();
	    count++;
	    if(mp1.containsKey(temp))
	    a1[mp1.get(temp).get(0)][mp1.get(temp).get(1)]=0;
	    if(mp2.containsKey(temp))
	    a2[mp2.get(temp).get(0)][mp2.get(temp).get(1)]=0;
	    if(count>4)
	    {
	    	PrintTable.print(a1,1);
	    	PrintTable.print(a2,2);
	    }
	    win1=Check.checkBingo(a1);
	    if(win1==5)
	        System.out.println("winner is player 1");
	    win2=Check.checkBingo(a2);
	    if(win2==5)
	        System.out.println("winner is player 2");
	    
	    System.out.println("player 2 say a number:");
	    temp=sc.nextInt();
	    System.out.println();
	    System.out.println();
	    count++;
	    if(mp1.containsKey(temp))
		    a1[mp1.get(temp).get(0)][mp1.get(temp).get(1)]=0;
		    if(mp2.containsKey(temp))
		    a2[mp2.get(temp).get(0)][mp2.get(temp).get(1)]=0;
	      if(count>4)
	    {

		    	PrintTable.print(a1,1);
		    	PrintTable.print(a2,2);
	    }
	    win1=Check.checkBingo(a1);
	    if(win1==5)
	        System.out.println("winner is player 1");
	    win2=Check.checkBingo(a2);
	    if(win2==5)
	        System.out.println("winner is player 2");
	    }
	    
	            
  
	}
}
