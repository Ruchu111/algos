import java.io.BufferedReader;
import java.io.InputStreamReader;


class HourMinutesAngle {
    public static void main(String args[] ) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        int answer=0;
        int testCases = Integer.parseInt(line);
        for (int i = 0; i < testCases; i++) {
           String hoursAndMinute = br.readLine();
           int hours = Integer.valueOf(hoursAndMinute.split(" ")[0]);
           System.out.println("hours "+hours);
           int minutes = Integer.valueOf(hoursAndMinute.split(" ")[1]);
           System.out.println("min "+minutes);

           int hoursAngleFromZero = (hours%12)*30+30*minutes/60;
            System.out.println("hoursAngleFromZero "+hoursAngleFromZero);
           int minAngleFromZero = minutes*6;

           System.out.println("minAngleFromZero "+minAngleFromZero);
          
           int diff = hoursAngleFromZero - minAngleFromZero;
           
           if(diff<(360-diff))
           answer = diff;
           else
           answer = 360-diff;
           
           
        }
        System.out.println(answer);
    }
}
