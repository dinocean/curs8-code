package ro.fasttrackit.curs8.animal;

public class Main {
    public static void main(String[] args) {
        Interface animalCat = new Cat();
        System.out.println(animalCat.walk());
        System.out.println(animalCat.eat());
        System.out.println(animalCat.talk());
        System.out.println("----------------------------------");
        Interface animalMouse = new Mouse();
        System.out.println(animalMouse.walk());
        System.out.println(animalMouse.eat());
        System.out.println(animalMouse.talk());
        System.out.println("----------------------------------");
        Interface animalChicken = new Chicken();
        System.out.println(animalChicken.walk());
        System.out.println(animalChicken.eat());
        System.out.println(animalChicken.talk());
        System.out.println("----------------------------------");
        Interface animalDuck = new Duck();
        System.out.println(animalDuck.walk());
        System.out.println(animalDuck.eat());
        System.out.println(animalDuck.talk());
    }
}
