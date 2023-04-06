import java.util.Scanner;
class Bmi
{
    private double height;
    private double weight;
    Bmi( )
    {
        this.height=1.64;
        this.weight=53.350;
    }
    Bmi (double height ,double weight)
    {
        this.height=height;
        this.weight=weight;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setWeight(double weight)
    {
        this.weight=weight;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    double calculateBmi()
    {
        return(this.weight/((this.height)*(this.height)));
    }
}

class Q_2
{
    public static void main( String [] aargs)
    {
        Bmi b1= new Bmi();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter height in meter & weight in killogram");
        b1.setHeight(sc.nextDouble());
        b1.setWeight(sc.nextDouble());
        double hei= b1.getHeight();
        double wei= b1.getWeight();
        System.out.println("height" +hei);
        System.out.println("weight" +wei);
        System.out.println("BMI :"+b1.calculateBmi());

        Bmi b2 =new Bmi(1.64,53.350);
        System.out.println("bmi calculation :"+ b2.calculateBmi());
       //System.out.println("bmi calculation :"+ b1.calculateBmi());


    }
}