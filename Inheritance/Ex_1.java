class Animal{
    public void makeSound(){
        System.out.println("Some generic animal sound");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}
public class Ex_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
    }
}
