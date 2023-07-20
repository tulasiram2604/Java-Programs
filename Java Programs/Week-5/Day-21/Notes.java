import java.util.*;
class Notes
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Amount");
      int th,fh,hud;
      int amt=sc.nextInt();
      int temp=amt;
      if(amt%100==0)
      {
        th=amt/1000;
        amt=(amt-(th*1000));
        fh=amt/500;
        amt=(amt-(fh*500));
        hud=amt/100;
        amt=(amt-(hud*100));
        System.out.println("The min notes we have to take for the "+temp+" is "+(th+fh+hud)+" Notes");
        System.out.println("Thousand notes are "+th);
        System.out.println("Five Hundred notes are "+fh);
        System.out.println("Hundred notes are "+hud); 
      }
      else
      {
        System.out.println("Please Enter the Amount in multiples of 100");
      }
    }
  }