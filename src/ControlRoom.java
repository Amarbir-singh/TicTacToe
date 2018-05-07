import java.io.IOException;
import java.util.Scanner;

public class ControlRoom 
{
	
   public static void main(String []args) throws IOException
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Game start");
	  
	   
	   String[][] a = new String[][]
			   {
		        {"_","_","_"},
		        {"_","_","_"},
		        {"_","_","_"}
			   };
	    System.out.println("00  01  02 \n10  11  12\n20  21  22" );
	    System.out.println("choose the position");
	    int n=1;
	   
	do
	{
	    for(int i=0; i<3;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		System.out.print("   ");
	    		System.out.print(a[i][j]);
	    		System.out.print("   ");
	    		
	        }
	    	System.out.println();
	    	
	    }
	    System.out.println();
    	System.out.println();
    
     while(n<9)
    {
    	System.out.println("Enter the row:  ");
    	int row = scanner.nextInt();
    	System.out.println("Enter the col:  ");
    	int col = scanner.nextInt();
    	if(((row==0)||(row==1)||(row==2))&&((col==0)||(col==1)||(col==2)))
    	{
    	 switch(row)
    	 {
    	 case 0:
    	 {
    	    switch(col)
        	{
        	 case 0:
        	 {
        		 System.out.println("Enter 0 or 1");
        		 
        		 int y = scanner.nextInt();
        		if((y==0)||(y==1))
        		{
        			  n++;
                     a[0][0]=String.format("%d",y);;
        		     
        		     
        		   for(int i=0; i<3;i++)
        		    {
        		    	for(int j=0;j<3;j++)
        		    	{
        		    		System.out.print("   ");
        		    		System.out.print(a[i][j]);
        		    		System.out.print("   ");
        		    		
        		        }
        		    	System.out.println();
        		    	System.out.println();
        		    	System.out.println();
        		    	
        		    }
        		   ComparisonWin(a);
        		}
        		else
        			System.out.println("enter 0 or 1 only");
        		  break;
        	 }
        	 case 1:
        	 {
        		 System.out.println("Enter 0 or 1");
        		 
                int y = scanner.nextInt();
        		if((y==0)||(y==1))
        		{
        			n++;
                  a[0][1]=String.format("%d",y);;
        		 
        		  for(int i=0; i<3;i++)
        		    {
        		    	for(int j=0;j<3;j++)
        		    	{
        		    		System.out.print("   ");
        		    		System.out.print(a[i][j]);
        		    		System.out.print("   ");
        		    		
        		        }
        		    	System.out.println();
        		    	System.out.println();
        		    	System.out.println();
        		    	
        		    }
        		  ComparisonWin(a);
        		}
        		else
        			System.out.println("enter 0 or 1 only");
        		  break;
        	 }
        	 case 2:
        	 {
        		 System.out.println("Enter 0 or 1");
        		 
        		 int y = scanner.nextInt();
        		if((y==0)||(y==1))
        		{
        			n++;
                  a[0][2]=String.format("%d",y);
        		 
        		  for(int i=0; i<3;i++)
        		    {
        		    	for(int j=0;j<3;j++)
        		    	{
        		    		System.out.print("   ");
        		    		System.out.print(a[i][j]);
        		    		System.out.print("   ");
        		    		
        		        }
        		    	System.out.println();
        		    	System.out.println();
        		    	System.out.println();
        		    	
        		    }
        		  ComparisonWin(a);
        		}
        		else
        			System.out.println("enter 0 or 1 only");
        		  break;
        	 }
        	 default :
        	 }
    	    break;
    	 }
    	 case 1:
    	 {
    		 switch(col)
        	 {
        	 case 0:
        	 {
        		 System.out.println("Enter 0 or 1");
        		 
        		 int y = scanner.nextInt();
        		if((y==0)||(y==1))
        		{
        			n++;
                  a[1][0]=String.format("%d",y);;
        		
        		  for(int i=0; i<3;i++)
        		    {
        		    	for(int j=0;j<3;j++)
        		    	{
        		    		System.out.print("   ");
        		    		System.out.print(a[i][j]);
        		    		System.out.print("   ");
        		    		
        		        }
        		    	System.out.println();
        		    	System.out.println();
        		    	System.out.println();
        		    	
        		    }
        		  ComparisonWin(a);
        		}
        		else
        			System.out.println("enter 0 or 1 only");
        		  break;
        	 }
        	 case 1:
        	 {
        		 System.out.println("Enter 0 or 1");
        		 
        		 int y = scanner.nextInt();
        		if((y==0)||(y==1))
        		{
        			n++;
        		
                  a[1][1]=String.format("%d",y);;
        		
        		  for(int i=0; i<3;i++)
        		    {
        		    	for(int j=0;j<3;j++)
        		    	{
        		    		System.out.print("   ");
        		    		System.out.print(a[i][j]);
        		    		System.out.print("   ");
        		    		
        		        }
        		    	System.out.println();
        		    	System.out.println();
        		    	System.out.println();
        		    	
        		    }
        		  ComparisonWin(a);
        		}
        		else
        			System.out.println("enter 0 or 1 only");
        		  break;
        	 }
        	 case 2:
        	 {
        		 System.out.println("Enter 0 or 1");
        		 
        		 int y = scanner.nextInt();
        		if((y==0)||(y==1))
        		{
        			n++;
                  a[1][2]=String.format("%d",y);;
        		 
        		  for(int i=0; i<3;i++)
        		    {
        		    	for(int j=0;j<3;j++)
        		    	{
        		    		System.out.print("   ");
        		    		System.out.print(a[i][j]);
        		    		System.out.print("   ");
        		    		
        		        }
        		    	System.out.println();
        		    	System.out.println();
        		    	System.out.println();
        		    	
        		    }
        		  ComparisonWin(a);
        		}
        		else
        			System.out.println("enter 0 or 1 only");
        		  break;
        	 }
        	 default :
        	 }
    		 break;
    	 }
    	 case 2:
    	 {
    		 switch(col)
        	 {
        	 case 0:
        	 {
        		 System.out.println("Enter 0 or 1");
        		 
        		 int y = scanner.nextInt();
        		if((y==0)||(y==1))
        		{
        			n++;
                  a[2][0]=String.format("%d",y);;
        		 
        		  for(int i=0; i<3;i++)
        		    {
        		    	for(int j=0;j<3;j++)
        		    	{
        		    		System.out.print("   ");
        		    		System.out.print(a[i][j]);
        		    		System.out.print("   ");
        		    		
        		        }
        		    	System.out.println();
        		    	System.out.println();
        		    	System.out.println();
        		    	
        		    }
        		  ComparisonWin(a);
        		}
        		else
        			System.out.println("enter 0 or 1 only");
        		  break;
        	 }
        	 case 1:
        	 {
        		 System.out.println("Enter 0 or 1");
        		 
        		 int y = scanner.nextInt();
        		if((y==0)||(y==1))
        		{
        			n++;
                  a[2][1]=String.format("%d",y);;
        		
        		  for(int i=0; i<3;i++)
        		    {
        		    	for(int j=0;j<3;j++)
        		    	{
        		    		System.out.print("   ");
        		    		System.out.print(a[i][j]);
        		    		System.out.print("   ");
        		    		
        		        }
        		    	System.out.println();
        		    	System.out.println();
        		    	System.out.println();
        		    	
        		    }
        		  ComparisonWin(a);
        		}
        		  break;
        	 }
        	 case 2:
        	 {
        		 System.out.println("Enter 0 or 1");
        		 
        		 int y = scanner.nextInt();
        		if((y==0)||(y==1))
        		{
        			n++;
                  a[2][2]=String.format("%d",y);;
        		 
        		  for(int i=0; i<3;i++)
        		    {
        		    	for(int j=0;j<3;j++)
        		    	{
        		    		System.out.print("   ");
        		    		System.out.print(a[i][j]);
        		    		System.out.print("   ");
        		    		
        		        }
        		    	System.out.println();
        		    	System.out.println();
        		    	System.out.println();
        		    	
        		    }
        		  ComparisonWin(a);
        		}
        		else
        			System.out.println("enter 0 or 1 only");
        		  break;
        	 }
        	 default :
        	 }
    	  break;
    	 }
    	 default :
    	 }
    	} 
    	 
    	 if(n==9)
    		 System.out.println("DRAW!");
	}
     System.out.println("You want to play again.\n Enter y.");
  }while(scanner.nextLine().equals("y"));
	Runtime.getRuntime().exec("cls");   
	scanner.close();
	   
   }
   public static void ComparisonWin(String [][]a)
   {
	    String [][] b = new String[3][];
	    b=a;
	    if((b[0][0].equals("0"))&&(b[1][0].equals("0"))&&(b[2][0].equals("0")))
		  {
			System.out.println("First player won");  
			System.exit(0);
		  }
		  else if((b[0][1]=="0")&&(b[1][1]=="0")&&(b[2][1].equals("0")))
		  {
			  System.out.println("First player won");  
			  System.exit(0);
		  }
			  
		   else if((b[0][2].equals("0"))&&(b[1][2].equals("0"))&&(b[2][2].equals("0")))
		   {
			   System.out.println("First player won");
			   System.exit(0);
		   }
		   else if((b[0][0].equals("0"))&&(b[0][1].equals("0"))&&(b[0][2].equals("0")))
		   {
			   System.out.println("First player won");
			   System.exit(0);
		   }
		   else if((b[1][0].equals("0"))&&(b[1][1].equals("0"))&&(b[1][2].equals("0")))
		   {
			   System.out.println("First player won");
			   System.exit(0);
		   }
		    else if((b[2][0].equals("0"))&&(b[2][1].equals("0"))&&(b[2][2].equals("0")))
		    {
		    	System.out.println("First player won");
		    }
		    else if((b[0][1].equals("0"))&&(b[1][1].equals("0"))&&(b[2][2].equals("0")))
		    {
		    	System.out.println("First player won");
		    	System.exit(0);
		    }
			else if((b[0][2].equals("0"))&&(b[1][1].equals("0"))&&(b[2][0].equals("0")))
			{
				System.out.println("First player won");
				System.exit(0);
			}
		  else if((b[0][0].equals("1"))&&(b[1][0].equals("1"))&&(b[2][0].equals("1")))
		  {
			  System.out.println("second player won");
			  System.exit(0);
		  }
		  else if((b[0][1].equals("1"))&&(b[1][1].equals("1"))&&(b[2][1].equals("1")))
		  {
			  System.out.println("second player won");
			  System.exit(0);
		  }
			  
		   else if((b[0][2].equals("1"))&&(b[1][2].equals("1"))&&(b[2][2].equals("1")))
		   {
			   System.out.println("second player won");
			   System.exit(0);
		   }
		   else if((b[0][0].equals("1"))&&(b[0][1].equals("1"))&&(b[0][2].equals("1")))
		   {
			   System.out.println("second player won");
			   System.exit(0);
		   }
		   else if((b[1][0].equals("1"))&&(b[1][1].equals("1"))&&(b[1][2].equals("1")))
		   {
			   System.out.println("second player won");
			   System.exit(0);
		   }
		    else if((b[2][0].equals("1"))&&(b[2][1].equals("1"))&&(b[2][2].equals("1")))
		    {
		    	System.out.println("second player won");
		    	System.exit(0);
		    }
		    else if((b[0][0].equals("1"))&&(b[1][1].equals("1"))&&(b[2][2].equals("1")))
		    {
		    	System.out.println("second player won");
		    	System.exit(0);
		    }
			else if((b[0][2].equals("1"))&&(b[1][1].equals("1"))&&(b[2][0].equals("1")))
			{
				System.out.println("second player won");
				System.exit(0);
			}
			else
		         return;

	   
   }
}
