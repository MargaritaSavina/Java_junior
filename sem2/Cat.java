package sem2;

public class Cat extends Animal{


    private boolean domesticCat = false;
    public Cat(String name, int age) {
        super.name = name;
        super.age = age;
    }
    public  void makeSound(){
        System.out.println("Мяу");
    }

    public  void jump(){
        System.out.println("Котик подпрыгнул");
    }

    public void setDomesticCat(boolean domesticCat) {
        this.domesticCat = domesticCat;
    }
}
