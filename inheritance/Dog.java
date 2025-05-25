class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{

    void Bark() {
        System.out.println("Bark");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.Bark();}
}