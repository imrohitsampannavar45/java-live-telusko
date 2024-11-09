public class MethodOverloading
{
    public static void main(String[] args){


        Calc c= new Calc();
       System.out.println(c.add(10,4));
       System.out.println(c.add(10,2,5));
       System.out.println(c.add(10,4.5));
    }
}