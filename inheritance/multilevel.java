//multilevel inheritance
class Animal{
    void eat() {
        System.out.println("Animal eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Dog2 extends Dog {
    void weep() {
        System.out.println("Dog weep");
    }
}



class multilevel {
    public static void main(String[] args){
        Dog2 dog = new Dog2();
        dog.eat();
        dog.bark();
        dog.weep();
    }
    
}
