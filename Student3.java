class Student2{
  int id ;
  String name ;
    void display(){System.out.println(id+" "+name);}   
  
}

public class Student3 {
    public static void main(String args[]){   
     Student2 s1=new Student2();   
    Student2 s2=new Student2();   
     s1.display();   
   s2.display();   
    }
}
