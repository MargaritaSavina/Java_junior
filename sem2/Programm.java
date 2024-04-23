package sem2;
/*
Создайте абстрактный класс "Animal" с полями "name" и "age".
Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat")
с уникальными полями и методами.
Создайте массив объектов типа "Animal" и с использованием Reflection API
выполните следующие действия:
Выведите на экран информацию о каждом объекте.
Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.

*/


import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programm {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Cat cat1 = new Cat("cat1",2);
        cat1.setDomesticCat(true);
        animals.add(cat1);
        animals.add(new Dog("dog1",2));
        animals.add(new Cat("cat2",1));
        animals.add(new Cat("cat3",4));
        animals.add(new Dog("dog2",9));

        for(Animal animal : animals)  {

            Field[] fields = animal.getClass().getDeclaredFields();
            Field[] fields2 = animal.getClass().getSuperclass().getDeclaredFields();
            System.out.println("Имя: " + animal.name + "  Возраст: " + animal.age);
            animal.makeSound();



            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i]);
                for (int j = 0; j < fields2.length; j++) {
                    System.out.println(fields2[j]);
                }

            }
        }




    }
}
