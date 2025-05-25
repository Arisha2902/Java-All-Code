//hierarchical inheritance

class Animal{
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // @Override
    void dog_sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // @Override
    void cat_sound() {
        System.out.println("Cat meows");
    }
}
    

class hierarichal {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Dog dog = new Dog();
        Cat cat = new Cat();

        myDog.sound(); 
        myCat.sound();
        cat.cat_sound(); 

    }
}