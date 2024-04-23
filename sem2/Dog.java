package sem2;

public class Dog extends Animal {

    private boolean guardDog = false;
    public Dog(String name, int age) {
        super.name = name;
        super.age = age;
    }

    public  void makeSound(){
        System.out.println("Гав");
    }

    public  void run(){
        System.out.println("Собака побежала");
    }

    public void setGuardDog(boolean guardDog) {
        this.guardDog = guardDog;
    }
}
