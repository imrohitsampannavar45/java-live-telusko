public class Person{
    String name = "Rohit";
    int age = 23;
    String loc =  "Bengaluru";




    public void displayData(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(loc);

    }


    public String getInfo(){


        return "We are Coming up with fastrack spring course";
    }

    public void acceptInfo(String info){
System.out.println(info);
    }

public String moreInfoCourse(Double price)
{

    String info = "Fast tract Weekend Spring Batch Starts from next weekend the  fee is "+price;
    return info;


}





}