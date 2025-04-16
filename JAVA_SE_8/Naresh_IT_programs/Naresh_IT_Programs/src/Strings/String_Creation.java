package Strings;

public class String_Creation {
    public static void main(String[] args) {

        //String can be created in three different ways
        String x="Hello";
        String y=new String("Hello");
        char z[]={'H','e','l','l','o'};

        System.out.println("Using String literal :"+x+"\n"+"Using new Keyword :"+y+"\n"+"Using Character Array :"+z);
    }
}
