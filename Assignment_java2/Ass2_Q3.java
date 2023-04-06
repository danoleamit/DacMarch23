import java.util.*;
class Book
{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;
    public static Scanner sc=new Scanner(System.in);
  
    Book()
    {

    }

    Book(String title,String author,String publisher,String isbn,double price,int quantity)
    {

    }

    // void setTitle()
    // {

    // }
    // void setAuthor()
    // {
        
    // }
    // void setPublisher()
    // {
        
    // }
    // void setIsbn()
    // {
        
    // }
    // void setPrice()
    // {
        
    // }
    // void setQuantity()
    // {
        
    // }

    // String getTitle()
    // {

    // }
    // String getAuthor()
    // {
        
    // }

    // String getPublisher()
    // {
        
    // }

    // String getIsbn()
    // {
        
    // }

    // double getPrice()
    // {
        
    // }

    // int getQuantity()
    // {
        
    // }

    // void increaseQuantity(int quantity )
    // {
        
    // }
  
    // void decreaseQuantity(int quantity)
    // {

    // }

    // void getInventoryValue()
    // {

    // }
    void Inventory_info()
    { 
        
        System.out.println("Enter title : ");
       this.title=sc.nextLine();

        System.out.println("Enter Author name : ");
        this.author=sc.nextLine();

        System.out.println("Enter publisher : ");
        this.publisher=sc.nextLine();

        System.out.println("Enter ISBN : ");
        this.isbn=sc.nextLine();

        System.out.println("Enter year : ");
        this.year=sc.nextInt();

        System.out.println("Enter price: ");
        this.price=sc.nextDouble();

        System.out.println("Enter intial quantity : ");
        this.quantity=sc.nextInt();
        sc.nextLine();
         

       
        
    

    }


    void dis_Inventory_info()
    { 
        

        System.out.println(this.title+"  "+this.author+"  "+this.publisher+"  "+this.isbn+"  "+this.year+"   "+this.price+"    "+this.quantity);



     }
    




}

class Inventory
{ 

    Book b1=new Book();
    Book b2=new Book();

    void Add_info()
    {
    b1.Inventory_info();
    b2.Inventory_info();
    }
    void Show_info()
    {
       b1.dis_Inventory_info();
       b2.dis_Inventory_info();
    }
    
    


    
}



class Ass2_Q3
{
    public static void main(String[] args) 
    {
        Inventory I=new Inventory();
        I.Add_info();
        I.Show_info();

        
    }
}
