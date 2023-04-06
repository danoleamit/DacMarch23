class Float_25
{
    public static void main(String[] args)
    {
        float value=32.5f;
        Float in =new Float(value);
        Float sh1=in.floatValue();
        System.out.println(sh1); 
        byte b1 =in.byteValue();
        System.out.println("state of Float  instance into byte :"+b1); 
        Short b2=in.shortValue();
        System.out.println("state of Float instance into short :"+b2); 
        int a=in.intValue();
        System.out.println("state of float instance into int :"+a); 
        long l=in.longValue();
        System.out.println("state of Flaot instance into long :"+l); 
        float f=in.floatValue();
         System.out.println("state of Float instance into float :"+f); 
        double d=in.doubleValue();
         System.out.println("state of Float instance into double :"+d);
    }
}