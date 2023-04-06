class Double_29
{
    public static void main(String[] args)
    {
        double value=32521d;
        Double in =new Double(value);
        Double sh1=in.doubleValue();
        System.out.println(sh1); 
        byte b1 =in.byteValue();
        System.out.println("state of Double  instance into byte :"+b1); 
        Short b2=in.shortValue();
        System.out.println("state of Double instance into short :"+b2); 
        int a=in.intValue();
        System.out.println("state of Double instance into int :"+a); 
        long l=in.longValue();
        System.out.println("state of Double instance into long :"+l); 
        float f=in.floatValue();
         System.out.println("state of Double instance into float :"+f); 
        double d=in.doubleValue();
         System.out.println("state of Double instance into double :"+d);
    }
}