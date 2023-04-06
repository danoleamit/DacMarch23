class Int_16
{
    public static void main(String []args)
    {
        int value=60;
        String s1=Integer.toString(value);
        System.out.println("int value into String:"+s1);

        Integer s2=Integer.valueOf(value);
         System.out.println("int value into integer instance:"+s2);

         String str="231";
        Integer s3=Integer.valueOf(str);
          System.out.println("String instance into integer instance:"+s3);
    }
}