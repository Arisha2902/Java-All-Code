//constructor initializting and method with arguments
class Student2{
  int id ;
  String name ;

  //constructor
   Student2(){
    id= 101;
    name = "nm";
   }

  // metgod which accept parameter
    void display(int id, String name){
        System.out.println(id+" "+name);}  
        
    // method where we will pass value using constructor
    void display1(){
        System.out.println(id+" "+name);}  
  
}

public class Student3 {
    public static void main(String args[]){   
     Student2 s1=new Student2();   
     Student2 s2=new Student2();  
     s1.display1();   
     s2.display1();   
    }
}
