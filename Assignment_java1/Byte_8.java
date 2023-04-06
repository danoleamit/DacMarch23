class Byte_8
{
    public static void main(String [] args){
        byte a=8;
        String str = Byte.toString(a);
         System.out.println("byte value into String :"+str);

         Byte b =new Byte(a);
        System.out.println(" byte value into Byte instance."+b);

        str="111";
        b=Byte.valueOf(str);
        System.out.println("String instance into Byte instance:"+b);




    }
}