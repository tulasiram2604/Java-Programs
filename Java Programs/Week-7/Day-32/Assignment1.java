/* Simple Custom Exception Create a Java program that simulates a shopping cart. Define a custom exception called OutOfStockException. Implement a class representing an item in the cart with attributes like name, price, and quantity. When adding an item to the cart, throw the OutOfStockException if the quantity of the item is zero. Handle the exception appropriately and display an error message indicating that the item is out of stock*/
import java.util.Scanner;
class OutOfStockException extends Exception{
  OutOfStockException(String message)
  {
    super(message);
  }
}
class Items
  {
    private String name;
    private double price;
    private int quantity;
    public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return this.name;
    }
    public void setPrice(double price)
    {
      this.price=price;
    }
    public double getPrice()
    {
      return this.price;
    }
    public void setQuantity(int quantity)
    {
      this.quantity=quantity;
    }
    public int getQuantity()
    {
      return this.quantity;
    }
  }
class Cart extends Items
  {
      Scanner sc=new Scanner(System.in);
       static int count=3;
      Items items[]=new Items[count];
      public void setDetails() throws OutOfStockException
        {
      for(int i=0;i<count;i++)
        {
          items[i]=new Items();
          System.out.println("enter item"+(i+1)+" details");
          System.out.println("enter name");
          String name=sc.next();
          items[i].setName(name);
          System.out.println("enter price of the item");
          double price=sc.nextDouble();
          items[i].setPrice(price);
          System.out.println("enter quantity of the item");
          int quantity=sc.nextInt();
          //items[i].setQuantity(quantity);
          if(quantity==0){
            throw new OutOfStockException("quantity must be other than zero");
          }
         else{
           items[i].setQuantity(quantity);
          }
        }
      }
        public  void display()
          {
          System.out.println("All the items are");
          for(int i=0;i<count;i++)
            {
           System.out.println(items[i].getName());
              System.out.println(items[i].getPrice());
              System.out.println(items[i].getQuantity());
            }
          }
      }
class Assignment1{
  public static void main(String args[])
  {
    Cart cart=new Cart();

        try{
          cart.setDetails();
        }
        catch(Exception e)
          {
            System.out.println(e);
          }
      System.out.println("Exception handled");
        cart.display();
        
  }
}