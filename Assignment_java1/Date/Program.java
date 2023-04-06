import java.util.Date;
class Program
{
    public static void main(String [] args)
    {
        Date date =new Date();
        int day= date.getDay();
        int month = date.getMonth()+1;
        int year = date.getYear()+1900;
        System.out.println(day +" / "+month+" / "+year);
    }
}