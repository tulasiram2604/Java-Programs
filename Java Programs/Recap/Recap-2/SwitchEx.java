//Check the Days in the month
import java.util.*;
class SwitchEx
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Month you wants to check");
      String mon=s.nextLine();
      switch(mon)
        {
          case "jan":
            {
            System.out.println("January has 31 days");
            break;
            }
            case "feb":
            {
            System.out.println("February has 28 days");
            break;
            }
            case "mar":
            {
            System.out.println("March has 31 days");
            break;
            }
            case "apr":
            {
            System.out.println("April has 30 days");
            break;
            }
            case "may":
            {
            System.out.println("May has 31 days");
            break;
            }
            case "jun":
            {
            System.out.println("June has 30 days");
            break;
            }
            case "jul":
            {
            System.out.println("July has 31 days");
            break;
            }
            case "aug":
            {
            System.out.println("August has 31 days");
            break;
            }
            case "sep":
            {
            System.out.println("September has 30 days");
            break;
        }
            case "oct":
            {
            System.out.println("October has 31 days");
            break;
    }
            case "nov":
            {
            System.out.println("November has 30 days");
            break;
  }
            case "dec":
            {
            System.out.println("December has 31 days");
            break;
            }
        }
    }
        }