class Int_17
{
    public static void main(String[] args)
    {
        int value=35;
        Integer in =new Integer(value);
        Integer sh1=in.intValue();
        System.out.println(sh1); 
        byte b1 =in.byteValue();
        System.out.println("state of int  instance into byte :"+b1); 
        Short b2=in.shortValue();
        System.out.println("state of int instance into short :"+b2); 
        int a=in.intValue();
        System.out.println("state of int instance into int :"+a); 
        long l=in.longValue();
        System.out.println("state of int instance into long :"+l); 
        float f=in.floatValue();
         System.out.println("state of int instance into float :"+f); 
        double d=in.doubleValue();
         System.out.println("state of int instance into double :"+d);
    }
}