import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author archana77
 */

class Ghost {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic 
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        int ghost_of_day = 0;
        int consistent = 0;
        
        int [] no_day =  new int[n];
        
        for(int i = 0; i < no_day.length; i++)
        {
            no_day[i] = in.nextInt();
        }
        
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < no_day.length; i++)
        {
            if(mp.get(no_day[i])!=null)
            {
		         mp.put(no_day[i], (mp.get(no_day[i])+1));
	        }
			
            else
            {
	           mp.put(no_day[i], 1);
	        }
			
            if(mp.get(no_day[i]) > ghost_of_day)
	        {
		      ghost_of_day = mp.get(no_day[i]);
		      consistent = no_day[i];
	        }
	
            else 
              if(mp.get(no_day[i]) == ghost_of_day)
	          {
		         if(no_day[i] > consistent)
			         consistent = no_day[i];
	          }
	
            System.out.println((consistent) + " " + (ghost_of_day));
        }
    }
}

