class Byte_9
{
    public static void main(String [] args)
    {
        
        Byte B1 =Byte.valueOf((byte)122);
        System.out.println(B1); 
        byte b1 = B1.byteValue();
        System.out.println("state of Byte instance into byte :"+b1); 
        Short sh=B1.shortValue();
        System.out.println("state of Byte instance into short :"+sh); 
        int a=B1.intValue();
        System.out.println("state of Byte instance into int :"+a); 
        long l=B1.longValue();
        System.out.println("state of Byte instance into long :"+l); 
        float f=B1.floatValue();
         System.out.println("state of Byte instance into float :"+f); 
        double d=B1.doubleValue();
         System.out.println("state of Byte instance into double :"+d); 
    
    }
}