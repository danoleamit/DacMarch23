class Short_13
{
    public static void main(String [] args){
        Short s=5000;
        String s1 = Short.toString(s);
         System.out.println("short value into String :"+s1);

        short s2 =Short.valueOf(s);
        System.out.println(" short value into Short instance :"+s2);

        String str="111";
       short sh =Short.valueOf(str);
        System.out.println("String instance into Short instance:"+sh);




    }
}
