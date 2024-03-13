
class Animal{
    void makeSound(){
        System.out.println("The Animal makes a sound");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("The cat meows");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("The dog barks");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal A = new Animal();
        A.makeSound();

        Cat C = new Cat();
        C.makeSound();

        Dog D = new Dog();
        D.makeSound();
    }
}

