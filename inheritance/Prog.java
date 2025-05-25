//inheritance example
class Emp{
    int id = 222000;
}


class Prog extends Emp {
    int bonus=10000;  
    public static void main(String args[]){   
        Prog p = new Prog();
        System.out.println("Employee ID: " + p.id);
        System.out.println("Employee Bonus: " + p.bonus); 
    }
    
}
