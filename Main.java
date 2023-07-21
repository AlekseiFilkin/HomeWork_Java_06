/*
Задание
Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
Создайте метод
public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
Создайте метод
public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */


import java.util.HashSet;


public class Main {

    public static void Separator(char symbol, int length) {
        StringBuilder builder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            builder.append(symbol);
        }
        System.out.println(builder);
    }
    public static void main(String[] args) {

        System.out.println("Класс без переопределенных методов equals() и hashCode()");
        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat("Barsik", "black", 4, Sex.MALE));
        cats.add(new Cat("Fishka", "black-brown", 2, Sex.FEMALE));
        cats.add(new Cat("Murzik", "white", 3, Sex.MALE));
        cats.add(new Cat("Barsik", "black", 4, Sex.MALE));

        System.out.println(cats);
        Separator ('-', 100);
        System.out.println("Класс c переопределенными методами equals() и hashCode()");
        HashSet<CatPlus> cats2 = new HashSet<>();
        cats2.add(new CatPlus("Barsik", "black", 4, Sex.MALE));
        cats2.add(new CatPlus("Fishka", "black-brown", 2, Sex.FEMALE));
        cats2.add(new CatPlus("Murzik", "white", 3, Sex.MALE));
        cats2.add(new CatPlus("Barsik", "black", 4, Sex.MALE));
        System.out.println(cats2);

    }
}