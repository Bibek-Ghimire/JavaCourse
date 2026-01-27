package InheritanceImpl.Multilevel_Inheritance;



public class Dog extends Mammal{

    public void bark(){
        System.out.println("Dog barks");
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.giveBirth();
    }
}
