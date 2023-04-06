class Float_24{
    public static void main(String args[]){
        float value=15.05f;
        String str=Float.toString(value);
        System.out.println(str);

        double value1=10.10d;
        Double bs=new Double(value1);
        Double value3=bs.doubleValue();
        System.out.println(value3);

        Float bs1=new Float(value);
        Float value4=bs1.floatValue();
        System.out.println(value4);

        String str1="986";
        float f1=Float.parseFloat(str1);
        System.out.println(f1);
        

        String f2=Float.toHexString(value);
        System.out.println(f2);
    }

}