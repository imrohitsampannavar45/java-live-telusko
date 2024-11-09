public class Example{
    public static void main(String[] args){

        Person p = new Person();
        System.out.println(p.loc);
        // System.out.println("Hello World");

        p.displayData();
       String info = p.getInfo();
       System.out.println(info);
       p.acceptInfo("Please Start OOPS Fast");
       String more = p.moreInfoCourse(3000.0);
       System.out.println(more);



       }
}