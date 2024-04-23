package sem3;
//Разработайте класс Student с полями String name, int age, transient double GPA (средний балл).
//Обеспечьте поддержку сериализации для этого класса.
//Создайте объект класса Student и инициализируйте его данными.
//Сериализуйте этот объект в файл.
//Десериализуйте объект обратно в программу из файла.
//Выведите все поля объекта, включая GPA, и ответьте на вопрос,
//почему значение GPA не было сохранено/восстановлено.
public class Main {

    public static void main(String[] args) {

        Student std = new Student("Alex", 22,4.2);

        std.serializeInfo();
        std.deserializeInfo();


    }
}
