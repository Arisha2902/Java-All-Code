//constructor
class Car1{
    int id;

    //constructor
    Car1(int id) {
        this.id = id;
    }

    void display1(){
        System.out.println(id+" ");}  

}

public class Car {
    public static void main(String args[]){   
     Car1 s1=new Car1(12);   
     Car1 s2=new Car1(45);  
     s1.display1();   
     s2.display1();   
    }
    
}
