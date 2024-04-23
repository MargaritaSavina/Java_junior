package sem3;

import java.io.*;

public class Student implements Serializable {


    private String name;
    private int age;
    private transient double GPA;

    public Student(String name, int age, double GPA){
        this.GPA = GPA;
        this.age = age;
        this.name = name;
    }

    public  Student(){}

    public void serializeInfo(){
        try(FileOutputStream fileOut = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\java-junior\\src\\sem3\\save.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(this);
            }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deserializeInfo(){
        try(FileInputStream fileIn = new FileInputStream("C:\\Users\\user\\IdeaProjects\\java-junior\\src\\sem3\\save.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Student std = (Student) in.readObject();
            System.out.println(std.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void serializeInfoXml(){

    }

    @Override
    public String toString() {
        return "Имя: " + name + "  Возраст: " + age + "  Средний балл: " + GPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
