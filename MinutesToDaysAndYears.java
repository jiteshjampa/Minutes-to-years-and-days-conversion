import JiteshDetails.year;
import JiteshDetails.day;
import java.util.Scanner;
public class MinutesToDaysAndYears{
public static void main(String args[])
{
int minutes,year3,day3;
int day1,minutes1,year1,year2;
Scanner min=new Scanner(System.in);
System.out.println("Enter the number of minutes:");
minutes=min.nextInt();
year yea=new year();
year3=yea.getyear(minutes);
day d=new day();
day3=d.getday(minutes);
if(minutes<((365*24*60)) && minutes>(24*60))
{
System.out.println("For the given input of minutes, only the number of days can be shown");
System.out.println("Because the year has not completed");
System.out.println("The Number of days is:"+day3);
}
else if(minutes<(24*60))
{
System.out.println("The For the given input of minutes, It cannot be shown in either days or year");
System.out.println("Because one day has not finished");
}

else
{
minutes1=minutes/(60*24);
year1=year3*365;
day1=minutes1-year1;
System.out.println("The minutes in terms of year and days are:");
System.out.println("YEAR:"+year3);
System.out.println("DAYS:"+day1);
}

}
}
