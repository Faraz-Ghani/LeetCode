/* Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, 
return the day number of the year.
*/

 

public class DayOfTheYear {
    public int dayOfYear(String date) {
        int month = Integer.parseInt(date.substring(5,7));
        int day   = Integer.parseInt(date.substring(8,10));
        int year  = Integer.parseInt(date.substring(0,4));
        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        boolean leapyear = false;

        //loop through the array up to the month before our date
        for(int i = 0; i < month-1; i++){
            //add the number of days in each month
            day = day+arr[i];
        }
        //if the year is divisible by 4
        if(year%4==0){
            //if the year is divisible by 100 and not by 400
            if(year%100==0 && year%400!=0){
               leapyear=false;
            }
            //if the year is divisible by 100 and 400
            else{
                leapyear=true;
            }
        }

        //if the year is a leap year and the month is after February
        if(leapyear==true && month>2){
            //add a day
            day++;
        }

        return day;
    }
}
