import java.util.Scanner;
public class MinutesToYearAndDays{
public static void main(String args[])
{
int year=0,day=0;
int year1,year2,minutes1;
Scanner min=new Scanner(System.in);
System.out.println("Enter the number of minutes:");
int minutes=min.nextInt();
if(minutes<((365*24*60)) && minutes>(24*60))
{
System.out.println("For the given input of minutes, only the number of days can be shown");
System.out.println("Because the year has not completed");
int day2=minutes/(60*24);
System.out.println("The Number of days is:"+day2);
}
else if(minutes<(24*60))
{
System.out.println("The For the given input of minutes, It cannot be shown in either days or year");
System.out.println("Because one day has not finished");
}
else
{
year=365*24*60;
minutes1=minutes/(60*24);
year1=minutes/year;
year2=year1*365;
day=minutes1-year2;
System.out.println("The minutes in terms of year and days are:");
System.out.println("YEAR:"+year1);
System.out.println("DAYS:"+day);
}
}
}