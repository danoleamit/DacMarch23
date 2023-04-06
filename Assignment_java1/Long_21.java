class Long_21
{
    public static void main(String[] args)
    {
        long value=35000;
        Long in =new Long(value);
        Long sh1=in.longValue();
        System.out.println(sh1); 
        byte b1 =in.byteValue();
        System.out.println("state of long  instance into byte :"+b1); 
        Short b2=in.shortValue();
        System.out.println("state of long instance into short :"+b2); 
        int a=in.intValue();
        System.out.println("state of long instance into int :"+a); 
        long l=in.longValue();
        System.out.println("state of long instance into long :"+l); 
        float f=in.floatValue();
         System.out.println("state of long instance into float :"+f); 
        double d=in.doubleValue();
         System.out.println("state of long instance into double :"+d);
    }
}