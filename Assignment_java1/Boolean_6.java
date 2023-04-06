class Boolean_6
{
    public static void main(String [] args)
    {
        boolean a=true;
        String str= new String ();
        str = Boolean.toString(a);
        System.out.println("boolean value into String :"+str);
        Boolean t = new Boolean(a);
        System.out.println("boolean value into Boolean instance :"+t);
        String str1 = new String("true");
        boolean b ;
        b= Boolean.parseBoolean(str1);
        System.out.println("String value into boolean value :"+b);
        t = Boolean.valueOf(str1);
        System.out.println("String value into Boolean instance :"+t);
    }
}