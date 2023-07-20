class Product
  {
    String proname;
    int price;
    int quantity;
      Product(String proname,int price,int quantity)
        {
        System.out.println("Product name is "+proname);
        System.out.println("Price of the product is "+price+"rs");
        System.out.println("Quantity of the product is "+quantity+"kgs"+"\n");
        }
      public static void main(String[]args)
    {
      Product pro1=new Product("Rice",300,2);
      Product pro2=new Product("dal",400,4);
      Product pro3=new Product("Sugar",150,3);
    }
  }