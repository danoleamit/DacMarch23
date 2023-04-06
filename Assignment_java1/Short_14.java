class Short_14
{
    public static void main(String [] args)
    {
        short value=5000;
        Short sh =new Short(value);
        Short sh1=sh.shortValue();
        System.out.println(sh1); 
        byte b1 = sh.byteValue();
        System.out.println("state inof short stance into byte :"+b1); 
        Short b2=sh.shortValue();
        System.out.println("state of short instance into short :"+b2); 
        int a=sh.intValue();
        System.out.println("state of short instance into int :"+a); 
        long l=sh.longValue();
        System.out.println("state of short instance into long :"+l); 
        float f=sh.floatValue();
         System.out.println("state of short instance into float :"+f); 
        double d=sh.doubleValue();
         System.out.println("state of short instance into double :"+d); 
    
    }
}