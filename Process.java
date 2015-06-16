import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Process {
    public static void main(String args[] ) throws Exception {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int unitOfTime =0 ;
    
        int NoOfProcess = Integer.parseInt(line);
              String[] callingOrder = br.readLine().split(" ");

              // ArrayList aList = new ArrayList(Arrays.asList(br.readLine().split(" ")));
	  // ArrayList idealOrder = new ArrayList(Arrays.asList(br.readLine().split(" ")));
               String[] idealOrder = br.readLine().split(" ");
	  while(!Arrays.equals(callingOrder,idealOrder)){
	  		unitOfTime = unitOfTime +1;
            	reOrder(callingOrder,NoOfProcess);
            }
        System.out.println("unit of time" +unitOfTime);
    }

    static void reOrder(String[] callingOrder,int NoOfProcess){
    	String temp = callingOrder[0];
    	int i=0;
    	for(i =0; i<NoOfProcess-1;i++){
    		callingOrder[i] = callingOrder[i+1];	
    	}
    	callingOrder[i] = temp;
    	for(int j=0;j<callingOrder.length;j++)
    	System.out.print(callingOrder[j]+ " ");
    }
}
