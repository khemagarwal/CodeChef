/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        ArrayList<Integer> payments=new ArrayList<Integer>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        
		int nooftc=sc.nextInt();
		for(int i=0;i<nooftc;i++)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int initialsum=0;
            int aftersum=0;
            for(int j=0;j<n;j++)
		    {
		        payments.add(sc.nextInt());
                initialsum=initialsum+payments.get(j);
                if(payments.get(j) > k)
                {
                    aftersum=aftersum+(k);
                }
                else
                {
                    aftersum=aftersum+(payments.get(j));
                }	        
            }

            
            result.add(initialsum-aftersum);
            payments.clear();
          
            
		    
        }
        for(int a : result)
        {
            System.out.println(a);
        }
	}
}
